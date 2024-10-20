package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1751Nm1 extends View {
    public static final /* synthetic */ int h = 0;
    public final Rect a;
    public final C12157za2 g;

    public C1751Nm1(Context context) {
        super(context);
        setVisibility(4);
        this.a = new Rect();
        this.g = new C12157za2();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        int systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        Rect rect = this.a;
        if (rect.left != systemWindowInsetLeft || rect.top != systemWindowInsetTop || rect.right != systemWindowInsetRight || rect.bottom != systemWindowInsetBottom) {
            rect.set(systemWindowInsetLeft, systemWindowInsetTop, systemWindowInsetRight, systemWindowInsetBottom);
            Iterator it = this.g.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                }
                ((InterfaceC1621Mm1) c11814ya2.next()).d();
            }
        }
        return windowInsets;
    }
}
