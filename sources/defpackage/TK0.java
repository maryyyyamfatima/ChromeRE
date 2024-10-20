package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import org.chromium.base.BundleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TK0 implements InterfaceC2938Wp3, InterfaceC6999kY2 {
    public final Activity a;
    public final Context g;
    public final boolean h;
    public final C12157za2 i = new C12157za2();

    @Override // defpackage.InterfaceC6999kY2
    public final void a(int i) {
    }

    @Override // defpackage.InterfaceC6999kY2
    public final void b(int i) {
    }

    public TK0(Activity activity, Context context, boolean z) {
        this.g = BundleUtils.d(context, "feedv2") ? new C7579mD(BundleUtils.f("feedv2"), context) : context;
        this.h = z;
        this.a = activity;
    }

    public final void e(int i, boolean z) {
        AbstractC4851eH1.d("Feed", "Feed video event %d", Integer.valueOf(i));
        EI2.h(i, 6, d("PlayEvent", z));
    }

    @Override // defpackage.InterfaceC6999kY2
    public final void c(int i) {
        Iterator it = this.i.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            }
            C5999hd4 c5999hd4 = (C5999hd4) c11814ya2.next();
            c5999hd4.h = ((i - c5999hd4.i) * (-1)) + c5999hd4.h;
            c5999hd4.i = i;
            RecyclerView recyclerView = c5999hd4.j;
            if (recyclerView != null) {
                LK3.a();
                int width = recyclerView.getWidth();
                int height = recyclerView.getHeight();
                for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt instanceof C11703yE1) {
                        C11703yE1 c11703yE1 = (C11703yE1) childAt;
                        if (c11703yE1.u()) {
                            int translationX = (int) childAt.getTranslationX();
                            int translationY = (int) childAt.getTranslationY();
                            int top = childAt.getTop() + translationY;
                            int bottom = childAt.getBottom() + translationY;
                            int left = childAt.getLeft() + translationX;
                            int right = childAt.getRight() + translationX;
                            if (left >= 0 && top >= 0 && right <= width && bottom <= height) {
                                Rect rect = c11703yE1.H;
                                if (rect.width() == c11703yE1.getWidth() && rect.height() == c11703yE1.getHeight()) {
                                }
                            }
                            Rect rect2 = new Rect(Math.max(0, -left), Math.max(0, -top), Math.min(right, width) - left, Math.min(bottom, height) - top);
                            if (!rect2.isEmpty()) {
                                c11703yE1.y(rect2, true);
                            }
                        }
                    }
                }
            }
        }
    }

    public static String d(String str, boolean z) {
        return AbstractC7848n0.a("ContentSuggestions.Feed.".concat(z ? "AutoplayMutedVideo." : "NormalUnmutedVideo."), str);
    }
}
