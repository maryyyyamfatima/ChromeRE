package org.chromium.content.browser.accessibility;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.ViewStructure;
import defpackage.C6600jN2;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ViewStructureBuilder {
    public final C6600jN2 a;

    public ViewStructureBuilder(C6600jN2 c6600jN2) {
        this.a = c6600jN2;
    }

    public final void populateViewStructureNode(ViewStructure viewStructure, String str, boolean z, int i, int i2, int i3, int i4, float f, boolean z2, boolean z3, boolean z4, boolean z5, String str2, int i5) {
        viewStructure.setClassName(str2);
        viewStructure.setChildCount(i5);
        if (z) {
            viewStructure.setText(str, i, i2);
        } else {
            viewStructure.setText(str);
        }
        if (f >= 0.0d) {
            viewStructure.setTextStyle(f, i3, i4, (z5 ? 8 : 0) | (z3 ? 2 : 0) | (z2 ? 1 : 0) | (z4 ? 4 : 0));
        }
    }

    public final void setViewStructureNodeBounds(ViewStructure viewStructure, boolean z, int i, int i2, int i3, int i4) {
        C6600jN2 c6600jN2 = this.a;
        int a = (int) c6600jN2.a(i);
        int a2 = (int) c6600jN2.a(i2);
        int a3 = (int) c6600jN2.a(i3);
        int a4 = (int) c6600jN2.a(i4);
        Rect rect = new Rect(a, a2, a + a3, a2 + a4);
        if (z) {
            rect.offset(0, (int) c6600jN2.k);
        }
        viewStructure.setDimens(rect.left, rect.top, 0, 0, a3, a4);
    }

    public void setViewStructureNodeHtmlInfo(ViewStructure viewStructure, String str, String str2, String[][] strArr) {
        Bundle extras = viewStructure.getExtras();
        extras.putCharSequence("htmlTag", str);
        extras.putCharSequence("display", str2);
        for (String[] strArr2 : strArr) {
            extras.putCharSequence(strArr2[0], strArr2[1]);
        }
    }

    public void setViewStructureNodeHtmlMetadata(ViewStructure viewStructure, String[] strArr) {
        viewStructure.getExtras().putStringArrayList("metadata", new ArrayList<>(Arrays.asList(strArr)));
    }

    public final void commitViewStructureNode(ViewStructure viewStructure) {
        viewStructure.asyncCommit();
    }

    public final ViewStructure addViewStructureNodeChild(ViewStructure viewStructure, int i) {
        return viewStructure.asyncNewChild(i);
    }
}
