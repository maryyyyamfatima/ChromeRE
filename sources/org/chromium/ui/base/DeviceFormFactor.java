package org.chromium.ui.base;

import android.content.Context;
import com.android.chrome.R;
import defpackage.V60;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class DeviceFormFactor {
    @Deprecated
    public static boolean isTablet() {
        return V60.a.getResources().getInteger(R.integer.f54830_resource_name_obfuscated_res_0x7f0c0072) >= 2;
    }

    public static boolean a(Context context) {
        return context.getResources().getInteger(R.integer.f54830_resource_name_obfuscated_res_0x7f0c0072) >= 2;
    }

    public static boolean b(WindowAndroid windowAndroid) {
        Object obj = ThreadUtils.a;
        Context context = (Context) windowAndroid.j.get();
        return (context == null ? 0 : context.getResources().getInteger(R.integer.f54830_resource_name_obfuscated_res_0x7f0c0072)) >= 2;
    }
}
