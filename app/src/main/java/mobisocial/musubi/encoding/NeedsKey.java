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

package mobisocial.musubi.encoding;

import mobisocial.crypto.IBHashedIdentity;

public class NeedsKey extends Exception {
	public final IBHashedIdentity identity_;
	public static class Signature extends NeedsKey {
		public Signature(IBHashedIdentity identity) {
			super(identity);
		}
	}
	public static class Encryption extends NeedsKey {
		public Encryption(IBHashedIdentity identity) {
			super(identity);
		}
	}
	public NeedsKey(IBHashedIdentity identity) {
		identity_ = identity;
	}
}
