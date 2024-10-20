package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ff */
/* loaded from: classes.dex */
public final class C5318ff extends CheckedTextView implements JN3 {
    public final C5662gf a;
    public final C3944bf g;
    public final C10132tg h;
    public C1584Mf i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:3:0x0048, B:5:0x004f, B:8:0x0055, B:10:0x0064, B:12:0x006a, B:14:0x0070, B:15:0x007b, B:17:0x0082, B:18:0x0089, B:20:0x0090), top: B:2:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:3:0x0048, B:5:0x004f, B:8:0x0055, B:10:0x0064, B:12:0x006a, B:14:0x0070, B:15:0x007b, B:17:0x0082, B:18:0x0089, B:20:0x0090), top: B:2:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5318ff(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            defpackage.FN3.a(r9)
            r0 = 2131034330(0x7f0500da, float:1.7679175E38)
            r8.<init>(r9, r10, r0)
            android.content.Context r9 = r8.getContext()
            defpackage.AbstractC3838bK3.a(r9, r8)
            tg r9 = new tg
            r9.<init>(r8)
            r8.h = r9
            r9.d(r10, r0)
            r9.b()
            bf r9 = new bf
            r9.<init>(r8)
            r8.g = r9
            r9.d(r10, r0)
            gf r9 = new gf
            r9.<init>(r8)
            r8.a = r9
            android.content.Context r9 = r8.getContext()
            int[] r3 = defpackage.JG2.B
            IN3 r9 = defpackage.IN3.m(r9, r10, r3, r0)
            android.content.Context r2 = r8.getContext()
            android.content.res.TypedArray r5 = r9.b
            r7 = 0
            r6 = 2131034330(0x7f0500da, float:1.7679175E38)
            r1 = r8
            r4 = r10
            defpackage.Ec4.l(r1, r2, r3, r4, r5, r6, r7)
            r1 = 1
            boolean r2 = r9.l(r1)     // Catch: java.lang.Throwable -> Lb1
            r3 = 0
            if (r2 == 0) goto L61
            int r2 = r9.i(r1, r3)     // Catch: java.lang.Throwable -> Lb1
            if (r2 == 0) goto L61
            android.content.Context r4 = r8.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L61 java.lang.Throwable -> Lb1
            android.graphics.drawable.Drawable r2 = defpackage.AbstractC2884Wf.a(r4, r2)     // Catch: android.content.res.Resources.NotFoundException -> L61 java.lang.Throwable -> Lb1
            r8.setCheckMarkDrawable(r2)     // Catch: android.content.res.Resources.NotFoundException -> L61 java.lang.Throwable -> Lb1
            goto L62
        L61:
            r1 = r3
        L62:
            if (r1 != 0) goto L7b
            boolean r1 = r9.l(r3)     // Catch: java.lang.Throwable -> Lb1
            if (r1 == 0) goto L7b
            int r1 = r9.i(r3, r3)     // Catch: java.lang.Throwable -> Lb1
            if (r1 == 0) goto L7b
            android.content.Context r2 = r8.getContext()     // Catch: java.lang.Throwable -> Lb1
            android.graphics.drawable.Drawable r1 = defpackage.AbstractC2884Wf.a(r2, r1)     // Catch: java.lang.Throwable -> Lb1
            r8.setCheckMarkDrawable(r1)     // Catch: java.lang.Throwable -> Lb1
        L7b:
            r1 = 2
            boolean r2 = r9.l(r1)     // Catch: java.lang.Throwable -> Lb1
            if (r2 == 0) goto L89
            android.content.res.ColorStateList r1 = r9.b(r1)     // Catch: java.lang.Throwable -> Lb1
            r8.setCheckMarkTintList(r1)     // Catch: java.lang.Throwable -> Lb1
        L89:
            r1 = 3
            boolean r2 = r9.l(r1)     // Catch: java.lang.Throwable -> Lb1
            if (r2 == 0) goto L9d
            r2 = -1
            int r1 = r9.h(r1, r2)     // Catch: java.lang.Throwable -> Lb1
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = defpackage.AbstractC3085Xt0.c(r1, r2)     // Catch: java.lang.Throwable -> Lb1
            r8.setCheckMarkTintMode(r1)     // Catch: java.lang.Throwable -> Lb1
        L9d:
            r9.n()
            Mf r9 = r8.i
            if (r9 != 0) goto Lab
            Mf r9 = new Mf
            r9.<init>(r8)
            r8.i = r9
        Lab:
            Mf r9 = r8.i
            r9.b(r10, r0)
            return
        Lb1:
            r10 = move-exception
            r9.n()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5318ff.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C5662gf c5662gf = this.a;
        if (c5662gf != null) {
            if (c5662gf.f) {
                c5662gf.f = false;
            } else {
                c5662gf.f = true;
                c5662gf.a();
            }
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC2884Wf.a(getContext(), i));
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3944bf c3944bf = this.g;
        if (c3944bf != null) {
            c3944bf.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3944bf c3944bf = this.g;
        if (c3944bf != null) {
            c3944bf.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10132tg c10132tg = this.h;
        if (c10132tg != null) {
            c10132tg.e(context, i);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C10132tg c10132tg = this.h;
        if (c10132tg != null) {
            c10132tg.b();
        }
        C3944bf c3944bf = this.g;
        if (c3944bf != null) {
            c3944bf.a();
        }
        C5662gf c5662gf = this.a;
        if (c5662gf != null) {
            c5662gf.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC1714Nf.a(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(GJ3.e(callback, this));
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return GJ3.d(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.i == null) {
            this.i = new C1584Mf(this);
        }
        this.i.c(z);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10132tg c10132tg = this.h;
        if (c10132tg != null) {
            c10132tg.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10132tg c10132tg = this.h;
        if (c10132tg != null) {
            c10132tg.b();
        }
    }

    @Override // defpackage.JN3
    public final void f(ColorStateList colorStateList) {
        C10132tg c10132tg = this.h;
        c10132tg.i(colorStateList);
        c10132tg.b();
    }

    @Override // defpackage.JN3
    public final void a(PorterDuff.Mode mode) {
        C10132tg c10132tg = this.h;
        c10132tg.j(mode);
        c10132tg.b();
    }
}
