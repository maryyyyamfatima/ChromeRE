package org.chromium.chrome.browser.lens;

import defpackage.C0257Bz1;
import defpackage.C2206Qz1;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LensDebugBridge {
    public static String[][] refreshDebugData() {
        C0257Bz1.b.a.getClass();
        C2206Qz1 g = C2206Qz1.g();
        if (!g.r) {
            return (String[][]) Array.newInstance((Class<?>) String.class, 0, 0);
        }
        ArrayList arrayList = g.s;
        int size = arrayList.size();
        String[][] strArr = new String[size + 1];
        strArr[0] = new String[]{"Page URL", "Timestamp", "Session ID", "Query ID", "Latency (ms)", "Result State", "Extracted Image Content"};
        for (int i = 1; i <= size; i++) {
            strArr[i] = (String[]) arrayList.get(size - i);
        }
        return strArr;
    }

    public static void startProactiveDebugMode() {
        C0257Bz1.b.a.getClass();
        C2206Qz1.g().r = true;
    }

    public static void stopProactiveDebugMode() {
        C0257Bz1.b.a.getClass();
        C2206Qz1 g = C2206Qz1.g();
        g.r = false;
        g.s.clear();
    }
}
