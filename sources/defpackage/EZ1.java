package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.NumberPicker;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class EZ1 extends AlertDialog implements DialogInterface.OnClickListener {
    public final NumberPicker a;
    public final NumberPicker g;
    public final NumberPicker h;
    public final NumberPicker i;
    public final NumberPicker j;
    public final C11542xm1 k;
    public final int l;
    public final int m;
    public final boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00da, code lost:            if (r7 == 0) goto L28;     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EZ1(android.content.Context r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, boolean r28, defpackage.C11542xm1 r29) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EZ1.<init>(android.content.Context, int, int, int, int, int, int, int, boolean, xm1):void");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        NumberPicker numberPicker = this.a;
        numberPicker.clearFocus();
        int value = numberPicker.getValue();
        NumberPicker numberPicker2 = this.g;
        numberPicker2.clearFocus();
        int value2 = numberPicker2.getValue();
        NumberPicker numberPicker3 = this.h;
        numberPicker3.clearFocus();
        int value3 = numberPicker3.getValue();
        NumberPicker numberPicker4 = this.i;
        numberPicker4.clearFocus();
        int value4 = (numberPicker4.getValue() * this.l) + this.m;
        if (!this.n) {
            NumberPicker numberPicker5 = this.j;
            numberPicker5.clearFocus();
            int value5 = numberPicker5.getValue();
            if (value == 12) {
                value = 0;
            }
            value += value5 * 12;
        }
        int i2 = value;
        C11542xm1 c11542xm1 = this.k;
        c11542xm1.b.b(c11542xm1.a, 0, 0, 0, i2, value2, value3, value4, 0);
    }
}
