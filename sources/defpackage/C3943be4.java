package defpackage;

import android.R;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: be4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3943be4 extends Ud4 {
    public final Yd4 a = new Yd4(this);
    public final Zd4 b = new Zd4(this);
    public C3599ae4 c;
    public final /* synthetic */ ViewPager2 d;

    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i;
        ViewPager2 viewPager2 = this.d;
        Wd4 wd4 = viewPager2.l;
        int i2 = 0;
        if (wd4.p == 1) {
            wd4.getClass();
            i = AbstractC12077zK2.J(view);
        } else {
            i = 0;
        }
        Wd4 wd42 = viewPager2.l;
        if (!(wd42.p == 1)) {
            wd42.getClass();
            i2 = AbstractC12077zK2.J(view);
        }
        AccessibilityNodeInfo.CollectionItemInfo obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(i, 1, i2, 1, false, false);
        accessibilityNodeInfoCompat.getClass();
        accessibilityNodeInfoCompat.a.setCollectionItemInfo(obtain);
    }

    public final void e() {
        int q;
        ViewPager2 viewPager2 = this.d;
        int i = R.id.accessibilityActionPageLeft;
        Ec4.j(viewPager2, R.id.accessibilityActionPageLeft);
        Ec4.g(viewPager2, 0);
        Ec4.j(viewPager2, R.id.accessibilityActionPageRight);
        Ec4.g(viewPager2, 0);
        Ec4.j(viewPager2, R.id.accessibilityActionPageUp);
        Ec4.g(viewPager2, 0);
        Ec4.j(viewPager2, R.id.accessibilityActionPageDown);
        Ec4.g(viewPager2, 0);
        AbstractC8305oK2 abstractC8305oK2 = viewPager2.o.r;
        if (abstractC8305oK2 == null || (q = abstractC8305oK2.q()) == 0 || !viewPager2.t) {
            return;
        }
        Wd4 wd4 = viewPager2.l;
        boolean z = wd4.p == 1;
        Zd4 zd4 = this.b;
        Yd4 yd4 = this.a;
        if (z) {
            if (viewPager2.i < q - 1) {
                Ec4.k(viewPager2, new C5792h1(R.id.accessibilityActionPageDown, (CharSequence) null), yd4);
            }
            if (viewPager2.i > 0) {
                Ec4.k(viewPager2, new C5792h1(R.id.accessibilityActionPageUp, (CharSequence) null), zd4);
                return;
            }
            return;
        }
        boolean z2 = wd4.D() == 1;
        int i2 = z2 ? 16908360 : 16908361;
        if (z2) {
            i = 16908361;
        }
        if (viewPager2.i < q - 1) {
            Ec4.k(viewPager2, new C5792h1(i2, (CharSequence) null), yd4);
        }
        if (viewPager2.i > 0) {
            Ec4.k(viewPager2, new C5792h1(i, (CharSequence) null), zd4);
        }
    }

    public C3943be4(ViewPager2 viewPager2) {
        this.d = viewPager2;
    }

    public final void c(RecyclerView recyclerView) {
        WeakHashMap weakHashMap = Ec4.a;
        recyclerView.setImportantForAccessibility(2);
        this.c = new C3599ae4(this);
        ViewPager2 viewPager2 = this.d;
        if (viewPager2.getImportantForAccessibility() == 0) {
            viewPager2.setImportantForAccessibility(1);
        }
    }

    public final void a(AbstractC8305oK2 abstractC8305oK2) {
        e();
        abstractC8305oK2.J(this.c);
    }

    public final void b(AbstractC8305oK2 abstractC8305oK2) {
        if (abstractC8305oK2 != null) {
            abstractC8305oK2.L(this.c);
        }
    }
}
