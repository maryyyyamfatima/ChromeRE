package defpackage;

import J.N;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import com.android.chrome.R;
import java.text.DateFormat;
import java.util.Locale;
import org.chromium.chrome.browser.ntp.RecentTabsGroupView;
import org.chromium.chrome.browser.ntp.RecentlyClosedBridge;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rI2 */
/* loaded from: classes.dex */
public final class C9323rI2 extends AbstractC7951nI2 {
    public final /* synthetic */ C10695vI2 b;

    @Override // defpackage.AbstractC7951nI2
    public final int d() {
        return 1;
    }

    @Override // defpackage.AbstractC7951nI2
    public final int g() {
        return 0;
    }

    @Override // defpackage.AbstractC7951nI2
    public final void l(ContextMenu contextMenu) {
    }

    @Override // defpackage.AbstractC7951nI2
    public final int f() {
        return this.b.d.o.size() + 1;
    }

    @Override // defpackage.AbstractC7951nI2
    public final boolean i() {
        return N.MvzD6qT5(this.b.d.p.a);
    }

    @Override // defpackage.AbstractC7951nI2
    public final boolean j(int i) {
        C10695vI2 c10695vI2 = this.b;
        if (i == c10695vI2.d.o.size()) {
            C4857eI2 c4857eI2 = c10695vI2.d;
            if (!c4857eI2.t) {
                c4857eI2.i.run();
            }
            return true;
        }
        AbstractC11381xI2 c = c(i);
        if (c instanceof C12067zI2) {
            c10695vI2.d.c((C12067zI2) c, 1);
            return true;
        }
        C4857eI2 c4857eI22 = c10695vI2.d;
        if (!c4857eI22.t) {
            if (c instanceof C11724yI2) {
                c4857eI22.y.put(Integer.valueOf(c.a), Boolean.TRUE);
                FI2.a("MobileRecentTabManagerRecentGroupOpened");
            } else if (c instanceof C11038wI2) {
                c4857eI22.z.put(Integer.valueOf(c.a), Boolean.TRUE);
                FI2.a("MobileRecentTabManagerRecentBulkEventOpened");
            }
            RecentlyClosedBridge recentlyClosedBridge = c4857eI22.q;
            TabModel tabModel = c4857eI22.j;
            if (tabModel == null) {
                tabModel = ((AbstractC11276wz3) c4857eI22.h).k(c4857eI22.g.getId());
                c4857eI22.j = tabModel;
            }
            N.MEC13_Hg(recentlyClosedBridge.a, tabModel, c.a);
        }
        return true;
    }

    @Override // defpackage.AbstractC7951nI2
    public final void m(boolean z) {
        C4857eI2 c4857eI2 = this.b.d;
        if (c4857eI2.t) {
            return;
        }
        N.MJ2SUJYd(c4857eI2.p.a, z);
    }

    @Override // defpackage.AbstractC7951nI2
    /* renamed from: n */
    public final AbstractC11381xI2 c(int i) {
        C10695vI2 c10695vI2 = this.b;
        if (i == c10695vI2.d.o.size()) {
            return null;
        }
        return (AbstractC11381xI2) c10695vI2.d.o.get(i);
    }

    @Override // defpackage.AbstractC7951nI2
    public final void b(RecentTabsGroupView recentTabsGroupView, boolean z) {
        recentTabsGroupView.h.setText(R.string.0_resource_name_obfuscated_res_0x7f140946);
        recentTabsGroupView.i.setVisibility(8);
        recentTabsGroupView.b(false);
        recentTabsGroupView.a(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9323rI2(C10695vI2 c10695vI2) {
        super(c10695vI2);
        this.b = c10695vI2;
    }

    @Override // defpackage.AbstractC7951nI2
    public final void a(int i, C10352uI2 c10352uI2) {
        int i2;
        Locale locale;
        LocaleList locales;
        c10352uI2.b.setText("");
        c10352uI2.b.setVisibility(8);
        c10352uI2.a.setContentDescription(null);
        C10695vI2 c10695vI2 = this.b;
        if (i == c10695vI2.d.o.size()) {
            c10352uI2.a.setText(R.string.0_resource_name_obfuscated_res_0x7f140a40);
            Bitmap decodeResource = BitmapFactory.decodeResource(c10695vI2.a.getResources(), R.drawable.0_resource_name_obfuscated_res_0x7f09034a);
            Activity activity = c10695vI2.a;
            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807ea);
            C5590gR2 b = AbstractC4855eI0.b(activity.getResources(), Bitmap.createScaledBitmap(decodeResource, dimensionPixelSize, dimensionPixelSize, true));
            b.setColorFilter(AbstractC10957w33.c(activity), PorterDuff.Mode.SRC_IN);
            c10352uI2.c.setImageDrawable(b);
            c10352uI2.d.getLayoutParams().height = activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0806f1);
            return;
        }
        c10352uI2.d.getLayoutParams().height = c10695vI2.a.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0806ee);
        AbstractC11381xI2 c = c(i);
        if (!(c instanceof C12067zI2)) {
            boolean z = c instanceof C11724yI2;
            Activity activity2 = c10695vI2.a;
            if (z) {
                C11724yI2 c11724yI2 = (C11724yI2) c;
                i2 = c11724yI2.d.size();
                String str = c11724yI2.c;
                if (TextUtils.isEmpty(str)) {
                    c10352uI2.a.setText(activity2.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140941, Integer.valueOf(i2)));
                    c10352uI2.a.setContentDescription(activity2.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140942, Integer.valueOf(i2)));
                } else {
                    c10352uI2.a.setText(activity2.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14093f, str));
                    c10352uI2.a.setContentDescription(activity2.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140940, str));
                }
            } else {
                i2 = 0;
            }
            if (c instanceof C11038wI2) {
                i2 = ((C11038wI2) c).c.size();
                c10352uI2.a.setText(activity2.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14093d, Integer.valueOf(i2)));
                c10352uI2.a.setContentDescription(activity2.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14093e, Integer.valueOf(i2)));
            }
            if (c.b.getTime() != 0) {
                if (Build.VERSION.SDK_INT >= 24) {
                    locales = activity2.getResources().getConfiguration().getLocales();
                    locale = locales.get(0);
                } else {
                    locale = activity2.getResources().getConfiguration().locale;
                }
                c10352uI2.b.setText(DateFormat.getDateInstance(1, locale).format(c.b));
                c10352uI2.b.setVisibility(0);
            }
            C3483aI2 c3483aI2 = new C3483aI2(activity2);
            if (i2 != c3483aI2.i) {
                c3483aI2.i = i2;
                c3483aI2.invalidateSelf();
            }
            c10352uI2.c.setImageDrawable(c3483aI2);
            return;
        }
        C12067zI2 c12067zI2 = (C12067zI2) c;
        String str2 = c12067zI2.c;
        GURL gurl = c12067zI2.d;
        c10352uI2.a.setText(ON3.a(str2, gurl));
        String b2 = T34.b(gurl.i(), false);
        if (!TextUtils.isEmpty(b2)) {
            c10352uI2.b.setText(b2);
            c10352uI2.b.setVisibility(0);
        }
        C10695vI2.a(c10695vI2, c10352uI2, gurl, 0);
    }

    @Override // defpackage.AbstractC7951nI2
    public final void k(int i, ContextMenu contextMenu) {
        final AbstractC11381xI2 c = c(i);
        if (c == null) {
            return;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = new MenuItem.OnMenuItemClickListener() { // from class: qI2
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C9323rI2 c9323rI2 = C9323rI2.this;
                c9323rI2.getClass();
                int itemId = menuItem.getItemId();
                C10695vI2 c10695vI2 = c9323rI2.b;
                if (itemId == 1) {
                    c10695vI2.d.c((C12067zI2) c, 4);
                } else if (itemId == 2) {
                    C4857eI2 c4857eI2 = c10695vI2.d;
                    if (!c4857eI2.t) {
                        FI2.a("MobileRecentTabManagerRecentTabsCleared");
                        N.McFSdQa7(c4857eI2.q.a);
                    }
                }
                return true;
            }
        };
        if (c instanceof C12067zI2) {
            contextMenu.add(0, 1, 0, R.string.0_resource_name_obfuscated_res_0x7f1403ac).setOnMenuItemClickListener(onMenuItemClickListener);
        }
        contextMenu.add(0, 2, 0, R.string.0_resource_name_obfuscated_res_0x7f140954).setOnMenuItemClickListener(onMenuItemClickListener);
    }
}
