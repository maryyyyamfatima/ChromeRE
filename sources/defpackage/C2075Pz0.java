package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2075Pz0 implements TextWatcher {
    public final EditText a;
    public final boolean g = false;
    public boolean h = true;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C2075Pz0(EditText editText) {
        this.a = editText;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
        /*
            r0 = this;
            android.widget.EditText r2 = r0.a
            boolean r2 = r2.isInEditMode()
            if (r2 != 0) goto L29
            boolean r2 = r0.h
            if (r2 == 0) goto L15
            boolean r2 = r0.g
            if (r2 != 0) goto L13
            java.lang.Object r2 = defpackage.AbstractC7499lz0.a
            goto L15
        L13:
            r2 = 0
            goto L16
        L15:
            r2 = 1
        L16:
            if (r2 == 0) goto L19
            goto L29
        L19:
            if (r3 > r4) goto L29
            boolean r1 = r1 instanceof android.text.Spannable
            if (r1 != 0) goto L20
            goto L29
        L20:
            java.lang.Object r1 = defpackage.AbstractC7499lz0.a
            monitor-enter(r1)
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            r1 = 0
            throw r1
        L26:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            throw r2
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2075Pz0.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
