package org.chromium.chrome.browser.sharing;

import defpackage.S83;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SharingServiceProxy {
    public static SharingServiceProxy a;
    public static long b;

    public static void onProxyCreated(long j) {
        b = j;
    }

    public static void onProxyDestroyed() {
        b = 0L;
    }

    public static void createDeviceInfoAndAppendToList(ArrayList arrayList, String str, String str2, int i, long j) {
        arrayList.add(new S83());
    }
}
