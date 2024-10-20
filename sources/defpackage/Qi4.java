package defpackage;

import com.google.common.logging.nano.Vr$VREvent$SdkConfigurationParams;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.nano.Display$DisplayParams;
import com.google.vr.sdk.proto.nano.Preferences$UserPrefs;
import com.google.vr.sdk.proto.nano.SdkConfiguration$SdkConfigurationRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public interface Qi4 {
    CardboardDevice$DeviceParams a();

    Vr$VREvent$SdkConfigurationParams b(SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest);

    Display$DisplayParams c();

    void close();

    Preferences$UserPrefs d();

    boolean e(CardboardDevice$DeviceParams cardboardDevice$DeviceParams);
}
