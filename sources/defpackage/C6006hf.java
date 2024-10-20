package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hf */
/* loaded from: classes.dex */
public final class C6006hf {
    public final CompoundButton a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public C6006hf(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:3:0x001a, B:5:0x0021, B:8:0x0027, B:10:0x0036, B:12:0x003c, B:14:0x0042, B:15:0x004d, B:17:0x0054, B:18:0x005b, B:20:0x0062), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:3:0x001a, B:5:0x0021, B:8:0x0027, B:10:0x0036, B:12:0x003c, B:14:0x0042, B:15:0x004d, B:17:0x0054, B:18:0x005b, B:20:0x0062), top: B:2:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r7 = r9.a
            android.content.Context r0 = r7.getContext()
            int[] r2 = defpackage.JG2.H
            IN3 r8 = defpackage.IN3.m(r0, r10, r2, r11)
            android.content.Context r1 = r7.getContext()
            android.content.res.TypedArray r4 = r8.b
            r6 = 0
            r0 = r7
            r3 = r10
            r5 = r11
            defpackage.Ec4.l(r0, r1, r2, r3, r4, r5, r6)
            r10 = 1
            boolean r11 = r8.l(r10)     // Catch: java.lang.Throwable -> L73
            r0 = 0
            if (r11 == 0) goto L33
            int r11 = r8.i(r10, r0)     // Catch: java.lang.Throwable -> L73
            if (r11 == 0) goto L33
            android.content.Context r1 = r7.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L33 java.lang.Throwable -> L73
            android.graphics.drawable.Drawable r11 = defpackage.AbstractC2884Wf.a(r1, r11)     // Catch: android.content.res.Resources.NotFoundException -> L33 java.lang.Throwable -> L73
            r7.setButtonDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L33 java.lang.Throwable -> L73
            goto L34
        L33:
            r10 = r0
        L34:
            if (r10 != 0) goto L4d
            boolean r10 = r8.l(r0)     // Catch: java.lang.Throwable -> L73
            if (r10 == 0) goto L4d
            int r10 = r8.i(r0, r0)     // Catch: java.lang.Throwable -> L73
            if (r10 == 0) goto L4d
            android.content.Context r11 = r7.getContext()     // Catch: java.lang.Throwable -> L73
            android.graphics.drawable.Drawable r10 = defpackage.AbstractC2884Wf.a(r11, r10)     // Catch: java.lang.Throwable -> L73
            r7.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L73
        L4d:
            r10 = 2
            boolean r11 = r8.l(r10)     // Catch: java.lang.Throwable -> L73
            if (r11 == 0) goto L5b
            android.content.res.ColorStateList r10 = r8.b(r10)     // Catch: java.lang.Throwable -> L73
            r7.setButtonTintList(r10)     // Catch: java.lang.Throwable -> L73
        L5b:
            r10 = 3
            boolean r11 = r8.l(r10)     // Catch: java.lang.Throwable -> L73
            if (r11 == 0) goto L6f
            r11 = -1
            int r10 = r8.h(r10, r11)     // Catch: java.lang.Throwable -> L73
            r11 = 0
            android.graphics.PorterDuff$Mode r10 = defpackage.AbstractC3085Xt0.c(r10, r11)     // Catch: java.lang.Throwable -> L73
            r7.setButtonTintMode(r10)     // Catch: java.lang.Throwable -> L73
        L6f:
            r8.n()
            return
        L73:
            r10 = move-exception
            r8.n()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6006hf.b(android.util.AttributeSet, int):void");
    }

    public final void a() {
        CompoundButton compoundButton = this.a;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.d || this.e) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.d) {
                    mutate.setTintList(this.b);
                }
                if (this.e) {
                    mutate.setTintMode(this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }
}
