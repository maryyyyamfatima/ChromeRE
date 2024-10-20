package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Iz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1166Iz0 {
    public final C7155kz0 a;
    public final VW1 b;
    public final InterfaceC5781gz0 c;

    public C1166Iz0(VW1 vw1, C7155kz0 c7155kz0, C0776Fz0 c0776Fz0) {
        this.a = c7155kz0;
        this.b = vw1;
        this.c = c0776Fz0;
    }

    public final boolean b(CharSequence charSequence, int i, int i2, C0646Ez0 c0646Ez0) {
        if (c0646Ez0.c == 0) {
            InterfaceC5781gz0 interfaceC5781gz0 = this.c;
            FW1 c = c0646Ez0.c();
            int a = c.a(8);
            if (a != 0) {
                c.b.getShort(a + c.a);
            }
            C0776Fz0 c0776Fz0 = (C0776Fz0) interfaceC5781gz0;
            c0776Fz0.getClass();
            ThreadLocal threadLocal = C0776Fz0.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = c0776Fz0.a;
            String sb2 = sb.toString();
            int i3 = AbstractC5683gi2.a;
            c0646Ez0.c = textPaint.hasGlyph(sb2) ? 2 : 1;
        }
        return c0646Ez0.c == 2;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        GZ3[] gz3Arr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (gz3Arr = (GZ3[]) editable.getSpans(selectionStart, selectionEnd, GZ3.class)) != null && gz3Arr.length > 0) {
            for (GZ3 gz3 : gz3Arr) {
                int spanStart = editable.getSpanStart(gz3);
                int spanEnd = editable.getSpanEnd(gz3);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }
}
