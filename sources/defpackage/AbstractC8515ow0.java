package defpackage;

import android.view.View;
import android.widget.EditText;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.text.BreakIterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ow0 */
/* loaded from: classes.dex */
public abstract class AbstractC8515ow0 {
    public static final AtomicInteger a = new AtomicInteger();
    public static final BreakIterator b = BreakIterator.getCharacterInstance();

    public static C2924Wn a(View view, C3998bo c3998bo) {
        C2794Vn a2 = AbstractC9053qX.a();
        a2.a = view;
        a2.h = c3998bo;
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            String obj = editText.getText().toString();
            C6048hm c6048hm = (C6048hm) C6391im.n.j();
            if (c6048hm.h) {
                c6048hm.l();
                c6048hm.h = false;
            }
            C6391im c6391im = (C6391im) c6048hm.g;
            c6391im.getClass();
            obj.getClass();
            c6391im.j |= 1;
            c6391im.k = obj;
            C6391im c6391im2 = (C6391im) c6048hm.j();
            C9201qw0 c9201qw0 = (C9201qw0) C9543rw0.p.j();
            if (c9201qw0.h) {
                c9201qw0.l();
                c9201qw0.h = false;
            }
            C9543rw0 c9543rw0 = (C9543rw0) c9201qw0.g;
            c9543rw0.getClass();
            c6391im2.getClass();
            c9543rw0.k = c6391im2;
            c9543rw0.j |= 1;
            boolean isFocused = view.isFocused();
            if (c9201qw0.h) {
                c9201qw0.l();
                c9201qw0.h = false;
            }
            C9543rw0 c9543rw02 = (C9543rw0) c9201qw0.g;
            c9543rw02.j |= 8;
            c9543rw02.m = isFocused;
            int selectionEnd = editText.getSelectionEnd();
            if (c9201qw0.h) {
                c9201qw0.l();
                c9201qw0.h = false;
            }
            C9543rw0 c9543rw03 = (C9543rw0) c9201qw0.g;
            c9543rw03.j |= 2;
            c9543rw03.l = selectionEnd;
            BreakIterator breakIterator = b;
            breakIterator.setText(obj);
            breakIterator.first();
            int i = 0;
            while (breakIterator.next() != -1) {
                i++;
            }
            if (c9201qw0.h) {
                c9201qw0.l();
                c9201qw0.h = false;
            }
            C9543rw0 c9543rw04 = (C9543rw0) c9201qw0.g;
            c9543rw04.j |= 16;
            c9543rw04.n = i;
            C9543rw0 c9543rw05 = (C9543rw0) c9201qw0.j();
            K33 k33 = (K33) SenderStateOuterClass$SenderState.l.j();
            k33.p(C9543rw0.r, c9543rw05);
            a2.e = (SenderStateOuterClass$SenderState) k33.j();
        }
        return a2.a();
    }
}
