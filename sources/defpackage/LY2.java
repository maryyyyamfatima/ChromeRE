package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.facebook.litho.widget.LithoScrollView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LY2 implements InterfaceC9395rX {
    public ObjectAnimator a = null;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, final AbstractC9053qX abstractC9053qX) {
        final OY2 oy2 = (OY2) obj;
        return new C7345lZ(new Runnable() { // from class: HY2
            /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:            if (r10 > 0) goto L55;     */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 324
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.HY2.run():void");
            }
        });
    }

    public static View d(View view) {
        if ((view instanceof HorizontalScrollView) || (view instanceof LithoScrollView)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View d = d(viewGroup.getChildAt(i));
                if (d != null) {
                    return d;
                }
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return OY2.o;
    }
}
