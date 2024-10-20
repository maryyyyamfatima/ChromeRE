package com.facebook.litho;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import defpackage.AbstractC3285Zh0;
import defpackage.C11703yE1;
import defpackage.C3025Xh0;
import defpackage.InterfaceC3155Yh0;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LithoViewTestHelper {
    public static TestItem findTestItem(C11703yE1 c11703yE1, String str) {
        Deque findTestItems = c11703yE1.findTestItems(str);
        if (findTestItems.isEmpty()) {
            return null;
        }
        return (TestItem) findTestItems.getLast();
    }

    public static Deque findTestItems(C11703yE1 c11703yE1, String str) {
        return c11703yE1.findTestItems(str);
    }

    public static String viewToString(C11703yE1 c11703yE1) {
        return viewToString(c11703yE1, false).trim();
    }

    public static String viewToStringForE2E(View view, int i, boolean z) {
        return viewToStringForE2E(view, i, z, null);
    }

    public static String viewToStringForE2E(View view, int i, boolean z, InterfaceC3155Yh0 interfaceC3155Yh0) {
        if (!(view instanceof C11703yE1)) {
            return "";
        }
        HashMap hashMap = C3025Xh0.c;
        C3025Xh0 h = C3025Xh0.h(((C11703yE1) view).D);
        if (h == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        a(h, sb, true, z, i, 0, 0);
        return sb.toString();
    }

    public static String viewToString(C11703yE1 c11703yE1, boolean z) {
        int i;
        HashMap hashMap = C3025Xh0.c;
        C3025Xh0 h = C3025Xh0.h(c11703yE1.D);
        if (h == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            int i2 = 3;
            for (ViewParent parent = c11703yE1.getParent(); parent != null; parent = parent.getParent()) {
                i2++;
            }
            i = i2;
        } else {
            i = 0;
        }
        sb.append("\n");
        a(h, sb, z, false, i, 0, 0);
        return sb.toString();
    }

    public static void a(C3025Xh0 c3025Xh0, StringBuilder sb, boolean z, boolean z2, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i; i4++) {
            sb.append("  ");
        }
        AbstractC3285Zh0.addViewDescription(c3025Xh0, sb, i2, i3, z, z2, null);
        sb.append("\n");
        Rect b = c3025Xh0.b();
        Iterator it = c3025Xh0.c().iterator();
        while (it.hasNext()) {
            a((C3025Xh0) it.next(), sb, z, z2, i + 1, b.left, b.top);
        }
    }
}
