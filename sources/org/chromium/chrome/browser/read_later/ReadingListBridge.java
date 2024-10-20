package org.chromium.chrome.browser.read_later;

import com.android.chrome.R;
import defpackage.V60;
import defpackage.VH2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ReadingListBridge {
    public static void openReadingListPage() {
        VH2.a(false);
    }

    public static String getNotificationText(int i) {
        return V60.a.getResources().getQuantityString(R.plurals.f62680_resource_name_obfuscated_res_0x7f12002f, i, Integer.valueOf(i));
    }

    public static String getNotificationTitle() {
        return V60.a.getResources().getString(R.string.f84200_resource_name_obfuscated_res_0x7f140938);
    }
}
