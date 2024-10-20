package defpackage;

import J.N;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.chrome.browser.ntp.ForeignSessionHelper;
import org.chromium.chrome.browser.ntp.RecentTabsGroupView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mI2 */
/* loaded from: classes.dex */
public final class C7607mI2 extends AbstractC7951nI2 {
    public final ForeignSessionHelper.ForeignSession b;
    public final /* synthetic */ C10695vI2 c;

    @Override // defpackage.AbstractC7951nI2
    public final int d() {
        return 1;
    }

    @Override // defpackage.AbstractC7951nI2
    public final int g() {
        return 0;
    }

    @Override // defpackage.AbstractC7951nI2
    public final boolean j(int i) {
        EI2.h(2, 11, "HistoryPage.OtherDevicesMenu");
        this.c.d.a(this.b, c(i), 1);
        return true;
    }

    @Override // defpackage.AbstractC7951nI2
    public final void m(boolean z) {
        if (z) {
            EI2.h(6, 11, "HistoryPage.OtherDevicesMenu");
        } else {
            EI2.h(7, 11, "HistoryPage.OtherDevicesMenu");
        }
        C4857eI2 c4857eI2 = this.c.d;
        if (c4857eI2.t) {
            return;
        }
        N.MTY3Z1W7(c4857eI2.p.a, this.b.a, z);
    }

    @Override // defpackage.AbstractC7951nI2
    public final boolean i() {
        return N.MF5D$8jU(this.c.d.p.a, this.b.a);
    }

    @Override // defpackage.AbstractC7951nI2
    public final void b(RecentTabsGroupView recentTabsGroupView, boolean z) {
        String string;
        TextView textView = recentTabsGroupView.h;
        ForeignSessionHelper.ForeignSession foreignSession = this.b;
        textView.setText(foreignSession.b);
        recentTabsGroupView.i.setVisibility(0);
        TextView textView2 = recentTabsGroupView.i;
        long currentTimeMillis = System.currentTimeMillis() - foreignSession.c;
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        int i = (int) (currentTimeMillis / 86400000);
        int i2 = (int) (currentTimeMillis / 3600000);
        int i3 = (int) (currentTimeMillis / 60000);
        Resources resources = recentTabsGroupView.getResources();
        if (i > 0) {
            string = resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120022, i, Integer.valueOf(i));
        } else if (i2 > 0) {
            string = resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120023, i2, Integer.valueOf(i2));
        } else if (i3 > 0) {
            string = resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120024, i3, Integer.valueOf(i3));
        } else {
            string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140574);
        }
        textView2.setText(recentTabsGroupView.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14070c, string));
        recentTabsGroupView.b(true);
        recentTabsGroupView.a(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7607mI2(C10695vI2 c10695vI2, ForeignSessionHelper.ForeignSession foreignSession) {
        super(c10695vI2);
        this.c = c10695vI2;
        this.b = foreignSession;
    }

    @Override // defpackage.AbstractC7951nI2
    public final int f() {
        Iterator it = this.b.d.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((ForeignSessionHelper.ForeignSessionWindow) it.next()).a.size();
        }
        return i;
    }

    @Override // defpackage.AbstractC7951nI2
    /* renamed from: n */
    public final C6967kS0 c(int i) {
        Iterator it = this.b.d.iterator();
        while (it.hasNext()) {
            ForeignSessionHelper.ForeignSessionWindow foreignSessionWindow = (ForeignSessionHelper.ForeignSessionWindow) it.next();
            int size = foreignSessionWindow.a.size();
            ArrayList arrayList = foreignSessionWindow.a;
            if (i < size) {
                return (C6967kS0) arrayList.get(i);
            }
            i -= arrayList.size();
        }
        return null;
    }

    @Override // defpackage.AbstractC7951nI2
    public final void a(int i, C10352uI2 c10352uI2) {
        C6967kS0 c = c(i);
        String i2 = c.a.i();
        String str = c.b;
        if (TextUtils.isEmpty(str)) {
            str = i2;
        }
        c10352uI2.a.setText(str);
        String b = T34.b(i2, false);
        if (!TextUtils.isEmpty(b)) {
            c10352uI2.b.setText(b);
            c10352uI2.b.setVisibility(0);
        } else {
            c10352uI2.b.setText("");
            c10352uI2.b.setVisibility(8);
        }
        C10695vI2.a(this.c, c10352uI2, c.a, 1);
    }

    @Override // defpackage.AbstractC7951nI2
    public final void l(ContextMenu contextMenu) {
        contextMenu.add(R.string.0_resource_name_obfuscated_res_0x7f140944).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: jI2
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C10695vI2 c10695vI2;
                C7607mI2 c7607mI2 = C7607mI2.this;
                c7607mI2.getClass();
                EI2.h(8, 11, "HistoryPage.OtherDevicesMenu");
                ForeignSessionHelper.ForeignSession foreignSession = c7607mI2.b;
                Iterator it = foreignSession.d.iterator();
                C6967kS0 c6967kS0 = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    c10695vI2 = c7607mI2.c;
                    if (!hasNext) {
                        break;
                    }
                    Iterator it2 = ((ForeignSessionHelper.ForeignSessionWindow) it.next()).a.iterator();
                    while (it2.hasNext()) {
                        C6967kS0 c6967kS02 = (C6967kS0) it2.next();
                        if (c6967kS0 == null) {
                            c6967kS0 = c6967kS02;
                        } else {
                            c10695vI2.d.a(foreignSession, c6967kS02, 4);
                        }
                    }
                }
                if (c6967kS0 != null) {
                    c10695vI2.d.a(foreignSession, c6967kS0, 1);
                }
                return true;
            }
        });
        contextMenu.add(R.string.0_resource_name_obfuscated_res_0x7f140943).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: kI2
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C7607mI2 c7607mI2 = C7607mI2.this;
                c7607mI2.getClass();
                EI2.h(10, 11, "HistoryPage.OtherDevicesMenu");
                C4857eI2 c4857eI2 = c7607mI2.c.d;
                if (c4857eI2.t) {
                    return true;
                }
                N.MKRVXtGV(c4857eI2.m.a, c7607mI2.b.a);
                return true;
            }
        });
    }

    @Override // defpackage.AbstractC7951nI2
    public final void k(int i, ContextMenu contextMenu) {
        final C6967kS0 c = c(i);
        contextMenu.add(R.string.0_resource_name_obfuscated_res_0x7f1403ac).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: lI2
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C7607mI2 c7607mI2 = C7607mI2.this;
                c7607mI2.c.d.a(c7607mI2.b, c, 4);
                return true;
            }
        });
    }
}
