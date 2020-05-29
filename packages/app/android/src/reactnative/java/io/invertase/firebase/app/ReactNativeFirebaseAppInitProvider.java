package io.invertase.firebase.app;
import io.invertase.firebase.common.ReactNativeFirebaseInitProvider;

/*
 * Copyright (c) 2016-present Invertase Limited & Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this library except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

public class ReactNativeFirebaseAppInitProvider extends ReactNativeFirebaseInitProvider {
  private static final String PACKAGE_NAME = ReactNativeFirebaseApp.getApplicationContext().getPackageName();

  private static final String EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY = PACKAGE_NAME + ".reactnativefirebaseappinitprovider";

  @Override
  public String getEmptyProviderAuthority() {
    return EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY;
  }
}
