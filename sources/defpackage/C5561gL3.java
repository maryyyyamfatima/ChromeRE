package defpackage;

import J.N;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.SurroundingText;
import java.util.concurrent.LinkedBlockingQueue;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.content.browser.input.ImeAdapterImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gL3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5561gL3 extends BaseInputConnection implements UR {
    public static final XK3 m = new XK3(new YG2(0, 0), new YG2(-1, -1));
    public final YK3 a;
    public final ZK3 b;
    public final RunnableC3499aL3 c;
    public final RunnableC3843bL3 d;
    public final ImeAdapterImpl e;
    public final Handler f;
    public int g;
    public final LinkedBlockingQueue h;
    public int i;
    public OI3 j;
    public int k;
    public boolean l;

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public C5561gL3(View view, ImeAdapterImpl imeAdapterImpl, Handler handler) {
        super(view, true);
        this.a = new YK3(this);
        this.b = new ZK3(this);
        this.c = new RunnableC3499aL3(this);
        this.d = new RunnableC3843bL3(this);
        this.h = new LinkedBlockingQueue();
        AbstractC9118qi1.a();
        this.e = imeAdapterImpl;
        this.f = handler;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return this.f;
    }

    public final void f(OI3 oi3) {
        if (oi3 == null) {
            return;
        }
        a();
        if (this.g != 0) {
            return;
        }
        if (this.l) {
            ExtractedText c = c(oi3);
            int i = this.k;
            ImeAdapterImpl imeAdapterImpl = this.e;
            imeAdapterImpl.g.i(imeAdapterImpl.d(), i, c);
        }
        QF3 qf3 = AbstractC5103f04.a;
        final YG2 yg2 = oi3.b;
        final YG2 yg22 = oi3.c;
        PostTask.c(qf3, new Runnable() { // from class: MK3
            @Override // java.lang.Runnable
            public final void run() {
                C5561gL3 c5561gL3 = C5561gL3.this;
                c5561gL3.getClass();
                YG2 yg23 = yg2;
                int i2 = yg23.a;
                int i3 = yg23.b;
                YG2 yg24 = yg22;
                int i4 = yg24.a;
                int i5 = yg24.b;
                ImeAdapterImpl imeAdapterImpl2 = c5561gL3.e;
                imeAdapterImpl2.g.g(imeAdapterImpl2.d(), i2, i3, i4, i5);
            }
        });
    }

    public final OI3 e() {
        boolean z = false;
        if (ThreadUtils.h()) {
            AbstractC4851eH1.f("Ime", "InputConnection API is not called on IME thread. Returning cached result.", new Object[0]);
            return this.j;
        }
        a();
        PostTask.c(AbstractC5103f04.a, this.b);
        a();
        while (true) {
            try {
                OI3 oi3 = (OI3) this.h.take();
                oi3.getClass();
                if (oi3 instanceof XK3) {
                    return null;
                }
                if (oi3.e) {
                    if (!z) {
                        return oi3;
                    }
                    f(oi3);
                    return oi3;
                }
                z = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new AssertionError();
            }
        }
    }

    public final void a() {
        if (!(this.f.getLooper() == Looper.myLooper())) {
            throw new AssertionError();
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        if (charSequence == null) {
            return false;
        }
        QF3 qf3 = AbstractC5103f04.a;
        PostTask.c(qf3, new RunnableC4873eL3(this, charSequence, i));
        PostTask.c(qf3, this.c);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        if (charSequence == null) {
            return false;
        }
        if (TextUtils.equals(charSequence, "\n")) {
            beginBatchEdit();
            commitText("", 1);
            PostTask.c(AbstractC5103f04.a, new RunnableC5217fL3(this));
            endBatchEdit();
            return true;
        }
        QF3 qf3 = AbstractC5103f04.a;
        PostTask.c(qf3, new NK3(this, charSequence, i));
        PostTask.c(qf3, this.c);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        PostTask.c(AbstractC5103f04.a, new OK3(this, i));
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        PostTask.c(AbstractC5103f04.a, new PK3(this, i));
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        a();
        boolean z = (i & 1) > 0;
        this.l = z;
        if (z) {
            this.k = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return c(e());
    }

    public static ExtractedText c(OI3 oi3) {
        if (oi3 == null) {
            return null;
        }
        ExtractedText extractedText = new ExtractedText();
        CharSequence charSequence = oi3.a;
        extractedText.text = charSequence;
        extractedText.partialEndOffset = charSequence.length();
        extractedText.partialStartOffset = -1;
        YG2 yg2 = oi3.b;
        extractedText.selectionStart = yg2.a;
        extractedText.selectionEnd = yg2.b;
        extractedText.flags = oi3.d ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        a();
        a();
        this.g++;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        a();
        int i = this.g;
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        this.g = i2;
        if (i2 == 0) {
            f(e());
        }
        return this.g != 0;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        PostTask.c(AbstractC5103f04.a, new QK3(this, i, i2));
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        PostTask.c(AbstractC5103f04.a, new RK3(this, i, i2));
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        QF3 qf3 = AbstractC5103f04.a;
        PostTask.c(qf3, new SK3(this, keyEvent));
        PostTask.c(qf3, this.c);
        return true;
    }

    public final void b(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.appendCodePoint(i);
        this.e.o(sb.toString(), 1, true, 0);
        this.i = i2;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        PostTask.c(AbstractC5103f04.a, this.d);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        PostTask.c(AbstractC5103f04.a, new TK3(this, i, i2));
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        PostTask.c(AbstractC5103f04.a, new UK3(this, i, i2));
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final SurroundingText getSurroundingText(int i, int i2, int i3) {
        OI3 e = e();
        if (e == null) {
            return null;
        }
        return e.a(i, i2);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        OI3 e = e();
        if (e == null) {
            return null;
        }
        YG2 yg2 = e.b;
        return TextUtils.substring(e.a, Math.max(0, yg2.a - Math.max(0, Math.min(i, yg2.a))), yg2.a);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        OI3 e = e();
        if (e == null) {
            return null;
        }
        CharSequence charSequence = e.a;
        int length = charSequence.length();
        YG2 yg2 = e.b;
        return TextUtils.substring(charSequence, yg2.b, Math.min(charSequence.length(), yg2.b + Math.max(0, Math.min(i, length - yg2.b))));
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        YG2 yg2;
        int i2;
        int i3;
        OI3 e = e();
        if (e == null || (i2 = (yg2 = e.b).a) == (i3 = yg2.b)) {
            return null;
        }
        return TextUtils.substring(e.a, i2, i3);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        OI3 e = e();
        if (e == null) {
            return 0;
        }
        return TextUtils.getCapsMode(e.a, e.b.a, i);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        PostTask.c(AbstractC5103f04.a, new VK3(this, str, bundle));
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        PostTask.c(AbstractC5103f04.a, new WK3(this, i));
        return true;
    }

    public final void d() {
        ImeAdapterImpl imeAdapterImpl = this.e;
        if (imeAdapterImpl.f()) {
            N.M_V5g5ie(imeAdapterImpl.a, imeAdapterImpl);
        }
    }
}
