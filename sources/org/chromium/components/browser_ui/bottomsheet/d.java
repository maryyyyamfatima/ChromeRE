package org.chromium.components.browser_ui.bottomsheet;

import defpackage.AbstractC4851eH1;
import defpackage.HF;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class d extends HF {
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ BottomSheet i;

    @Override // defpackage.HF
    public final void b() {
        BottomSheet bottomSheet = this.i;
        if (bottomSheet.A) {
            return;
        }
        bottomSheet.m = null;
        StringBuilder sb = new StringBuilder("Ending settle animation: target: ");
        int i = this.g;
        sb.append(i);
        sb.append(", content null: ");
        sb.append(bottomSheet.u == null);
        AbstractC4851eH1.d("BottomSheet", sb.toString(), new Object[0]);
        bottomSheet.q(i, this.h);
        bottomSheet.s = -1;
    }

    public d(BottomSheet bottomSheet, int i, int i2) {
        this.i = bottomSheet;
        this.g = i;
        this.h = i2;
    }
}
