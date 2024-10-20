package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sW3 */
/* loaded from: classes.dex */
public abstract class AbstractC9737sW3 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Drawable drawable, int i, int i2) {
        Drawable drawable2;
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        drawable.setBounds(i3, i4, i3 + i, i4 + i2);
        if (!(drawable instanceof InterfaceC9394rW3) || (drawable2 = ((LM1) ((InterfaceC9394rW3) drawable)).a) == null) {
            return;
        }
        drawable2.setBounds(0, 0, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x005a, code lost:            if ((r6 == null) == false) goto L240;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0072, code lost:            if ((r6 == null) == false) goto L240;     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(defpackage.YV3 r6, defpackage.PV3 r7, defpackage.InterfaceC1045Ib r8, defpackage.FV3 r9) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9737sW3.c(YV3, PV3, Ib, FV3):void");
    }

    public static void a(PV3 pv3, List list, String str) {
        if (pv3 instanceof MV3) {
            MV3 mv3 = (MV3) pv3;
            mv3.a();
            list.addAll(mv3.b);
        } else {
            if (pv3 != null) {
                list.add(pv3);
                return;
            }
            throw new IllegalStateException(AbstractC4199cO1.a("[", str, "] Adding null to transition list is not allowed."));
        }
    }
}
