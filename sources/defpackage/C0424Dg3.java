package defpackage;

import android.provider.Settings;
import android.text.Editable;
import android.text.style.BackgroundColorSpan;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dg3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424Dg3 implements InterfaceC11558xp {
    public static final Pattern n = Pattern.compile("[\\p{script=latin}\\p{script=cyrillic}\\p{script=greek}\\p{script=hebrew}\\p{Punct} 0-9]*");
    public final InterfaceC11215wp a;
    public final C1505Lp b;
    public final C1505Lp c;
    public final C1505Lp d;
    public final C0294Cg3 e;
    public C0164Bg3 f;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean g = true;
    public boolean h = true;
    public boolean m = true;

    @Override // defpackage.InterfaceC11558xp
    public final void d() {
    }

    @Override // defpackage.InterfaceC11558xp
    public final String k() {
        return this.b.a;
    }

    @Override // defpackage.InterfaceC11558xp
    public final void i(int i, int i2) {
        C1505Lp c1505Lp = this.b;
        if (c1505Lp.c == i && c1505Lp.d == i2) {
            return;
        }
        c1505Lp.c = i;
        c1505Lp.d = i2;
        if (this.i > 0) {
            return;
        }
        int length = c1505Lp.a.length();
        if (c1505Lp.c()) {
            if (i <= length && i2 <= length) {
                this.d.b = "";
                c1505Lp.b = "";
                C0164Bg3 c0164Bg3 = this.f;
                if (c0164Bg3 != null) {
                    c0164Bg3.d();
                    this.f.e();
                } else {
                    this.e.a();
                    m();
                }
            } else {
                C0164Bg3 c0164Bg32 = this.f;
                if (c0164Bg32 != null) {
                    c0164Bg32.a();
                }
            }
        }
        n();
        m();
    }

    @Override // defpackage.InterfaceC11558xp
    public final void a(boolean z) {
        if (z) {
            return;
        }
        C1505Lp c1505Lp = this.c;
        c1505Lp.c = -1;
        c1505Lp.d = -1;
        C1505Lp c1505Lp2 = this.b;
        c1505Lp2.c = -1;
        c1505Lp2.d = -1;
    }

    public C0424Dg3(InterfaceC11215wp interfaceC11215wp) {
        this.a = interfaceC11215wp;
        C1505Lp c1505Lp = new C1505Lp(interfaceC11215wp.getSelectionStart(), interfaceC11215wp.getText().toString(), interfaceC11215wp.getSelectionEnd());
        this.b = c1505Lp;
        this.c = new C1505Lp(c1505Lp);
        this.d = new C1505Lp(c1505Lp);
        this.e = new C0294Cg3(interfaceC11215wp);
    }

    @Override // defpackage.InterfaceC11558xp
    public final InputConnection e(InputConnection inputConnection) {
        InterfaceC11215wp interfaceC11215wp = this.a;
        this.k = interfaceC11215wp.getSelectionStart();
        this.l = interfaceC11215wp.getSelectionEnd();
        this.i = 0;
        if (inputConnection == null) {
            this.f = null;
            return null;
        }
        C0164Bg3 c0164Bg3 = new C0164Bg3(this);
        this.f = c0164Bg3;
        c0164Bg3.setTarget(inputConnection);
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0424Dg3.m():void");
    }

    @Override // defpackage.InterfaceC11558xp
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C0164Bg3 c0164Bg3 = this.f;
        InterfaceC11215wp interfaceC11215wp = this.a;
        if (c0164Bg3 == null) {
            return ((AbstractC9843sp) interfaceC11215wp).d(keyEvent);
        }
        c0164Bg3.d();
        if (keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0) {
            this.f.a();
        }
        boolean d = ((AbstractC9843sp) interfaceC11215wp).d(keyEvent);
        this.f.e();
        return d;
    }

    @Override // defpackage.InterfaceC11558xp
    public final void g(CharSequence charSequence) {
        BackgroundColorSpan backgroundColorSpan;
        String charSequence2 = charSequence.toString();
        int length = charSequence.length();
        int length2 = charSequence.length();
        C1505Lp c1505Lp = this.b;
        c1505Lp.a = charSequence2;
        c1505Lp.b = "";
        c1505Lp.c = length;
        c1505Lp.d = length2;
        C0294Cg3 c0294Cg3 = this.e;
        InterfaceC11215wp interfaceC11215wp = c0294Cg3.a;
        if (interfaceC11215wp.isFocused()) {
            interfaceC11215wp.setCursorVisible(true);
        }
        Editable editableText = c0294Cg3.a.getEditableText();
        if (((editableText == null || (backgroundColorSpan = c0294Cg3.b) == null) ? -1 : editableText.getSpanStart(backgroundColorSpan)) != -1) {
            editableText.removeSpan(c0294Cg3.b);
        }
        c0294Cg3.b = null;
        this.c.a(c1505Lp);
        this.d.a(c1505Lp);
        if (this.i == 0) {
            n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // defpackage.InterfaceC11558xp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.CharSequence r6, int r7) {
        /*
            r5 = this;
            Cg3 r7 = r5.e
            r7.getClass()
            boolean r0 = r6 instanceof android.text.Editable
            r1 = 0
            Lp r2 = r5.b
            if (r0 == 0) goto L2a
            r0 = r6
            android.text.Editable r0 = (android.text.Editable) r0
            r3 = -1
            if (r0 == 0) goto L1c
            android.text.style.BackgroundColorSpan r4 = r7.b
            if (r4 != 0) goto L17
            goto L1c
        L17:
            int r4 = r0.getSpanStart(r4)
            goto L1d
        L1c:
            r4 = r3
        L1d:
            if (r4 == r3) goto L2a
            java.lang.CharSequence r6 = r0.subSequence(r1, r4)
            java.lang.String r6 = r6.toString()
            r2.a = r6
            goto L30
        L2a:
            java.lang.String r6 = r6.toString()
            r2.a = r6
        L30:
            int r6 = r5.i
            if (r6 <= 0) goto L35
            return
        L35:
            r5.g = r1
            Lp r6 = r5.d
            java.lang.String r0 = ""
            r6.b = r0
            r2.b = r0
            Bg3 r6 = r5.f
            if (r6 == 0) goto L4c
            r6.d()
            Bg3 r6 = r5.f
            r6.e()
            goto L52
        L4c:
            r7.a()
            r5.m()
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0424Dg3.b(java.lang.CharSequence, int):void");
    }

    @Override // defpackage.InterfaceC11558xp
    public final String j() {
        return this.b.b();
    }

    @Override // defpackage.InterfaceC11558xp
    public final void c(CharSequence charSequence, CharSequence charSequence2) {
        this.h = true;
        String str = ((String) charSequence).toString();
        String str2 = ((String) charSequence2).toString();
        int length = str.length();
        int length2 = str.length();
        C1505Lp c1505Lp = this.d;
        c1505Lp.a = str;
        c1505Lp.b = str2;
        c1505Lp.c = length;
        c1505Lp.d = length2;
        C0164Bg3 c0164Bg3 = this.f;
        if (c0164Bg3 != null) {
            c0164Bg3.d();
            this.f.e();
        }
        this.h = false;
    }

    @Override // defpackage.InterfaceC11558xp
    public final void h(boolean z) {
        this.h = z;
    }

    @Override // defpackage.InterfaceC11558xp
    public final boolean f() {
        if (this.i != 0 || !this.g) {
            return false;
        }
        C1505Lp c1505Lp = this.b;
        if (!c1505Lp.d()) {
            return false;
        }
        String string = Settings.Secure.getString(((AbstractC9843sp) this.a).getContext().getContentResolver(), "default_input_method");
        if (string == null) {
            string = "";
        }
        if ((string.contains(".iqqi") || string.contains("omronsoft") || string.contains(".iwnn")) ? false : true) {
            return n.matcher(c1505Lp.a).matches();
        }
        return false;
    }

    public final void n() {
        InterfaceC11215wp interfaceC11215wp = this.a;
        int selectionStart = interfaceC11215wp.getSelectionStart();
        int selectionEnd = interfaceC11215wp.getSelectionEnd();
        if (selectionStart == this.k && selectionEnd == this.l) {
            return;
        }
        this.k = selectionStart;
        this.l = selectionEnd;
        interfaceC11215wp.getClass();
    }

    @Override // defpackage.InterfaceC11558xp
    public final boolean l() {
        return this.m;
    }
}
