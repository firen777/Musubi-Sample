/*
 * Copyright 2012 The Stanford MobiSocial Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mobisocial.musubi.ui.fragments;

import mobisocial.musubi.R;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class PrivacyProtectionDialog extends DialogFragment {

    public static PrivacyProtectionDialog newInstance() {
        PrivacyProtectionDialog frag = new PrivacyProtectionDialog();
        Bundle args = new Bundle();
        frag.setArguments(args);
        return frag;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = super.onCreateDialog(savedInstanceState);
        d.setContentView(R.layout.sample_stats);
        d.setTitle("Privacy Protection");
        StringBuilder html = new StringBuilder();
        html.append("<html><p>Musubi was created as a research project at the Stanford Mobisocial Computing Lab ")
        	.append("to let users share data without an intermediary owning the data.  ")
        	.append("All the communicated data are owned by the users, stored on their own devices, and are encrypted on transit.  ")
        	.append("We help you import friends from your existing social networks like Facebook and Google, ")
        	.append("but we do not save any of your friends' information.</p>");
        html.append("</html>");
        TextView sample_text = (TextView)d.findViewById(R.id.stat_text);
        sample_text.setText(Html.fromHtml(html.toString()));
        Button ok_button = (Button)d.findViewById(R.id.stat_ok);
        ok_button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				dismiss();
			}
		});
        return d;
    }
}
