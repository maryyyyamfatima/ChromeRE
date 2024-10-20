package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1036Hz0 {
    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        AbstractC1296Jz0[] abstractC1296Jz0Arr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (abstractC1296Jz0Arr = (AbstractC1296Jz0[]) editable.getSpans(selectionStart, selectionEnd, AbstractC1296Jz0.class)) != null && abstractC1296Jz0Arr.length > 0) {
            for (AbstractC1296Jz0 abstractC1296Jz0 : abstractC1296Jz0Arr) {
                int spanStart = editable.getSpanStart(null);
                int spanEnd = editable.getSpanEnd(null);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }
}
