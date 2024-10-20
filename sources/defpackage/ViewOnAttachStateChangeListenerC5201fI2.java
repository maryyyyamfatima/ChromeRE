package defpackage;

import J.N;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import com.android.chrome.R;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.ntp.ForeignSessionHelper;
import org.chromium.chrome.browser.ntp.RecentlyClosedBridge;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fI2 */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC5201fI2 implements InterfaceC5451g12, ExpandableListView.OnChildClickListener, ExpandableListView.OnGroupCollapseListener, ExpandableListView.OnGroupExpandListener, InterfaceC4514dI2, View.OnAttachStateChangeListener, View.OnCreateContextMenuListener, InterfaceC2296Rr1, GC {
    public final JC a;
    public final ExpandableListView g;
    public final String h;
    public final ViewGroup i;
    public C4857eI2 j;
    public C10695vI2 k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;

    @Override // defpackage.InterfaceC5451g12
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.InterfaceC5451g12
    public final String getUrl() {
        return "chrome-native://recent-tabs/";
    }

    @Override // defpackage.InterfaceC5451g12
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // defpackage.InterfaceC5451g12
    public final int m(int i) {
        return i;
    }

    @Override // defpackage.InterfaceC5451g12
    public final void n(String str) {
    }

    @Override // defpackage.InterfaceC5451g12
    public final float o(float f) {
        return f;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // defpackage.InterfaceC5451g12
    public final int p(int i) {
        return i;
    }

    @Override // defpackage.InterfaceC5451g12
    public final String q() {
        return "recent-tabs";
    }

    @Override // defpackage.InterfaceC5451g12
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.InterfaceC5451g12
    public final int t() {
        return -1;
    }

    public ViewOnAttachStateChangeListenerC5201fI2(Activity activity, C4857eI2 c4857eI2, CC cc) {
        this.j = c4857eI2;
        this.h = activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14093c);
        this.j.s = this;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e024f, (ViewGroup) null);
        this.i = viewGroup;
        ExpandableListView expandableListView = (ExpandableListView) viewGroup.findViewById(R.id.odp_listview);
        this.g = expandableListView;
        C10695vI2 c10695vI2 = new C10695vI2(activity, c4857eI2);
        this.k = c10695vI2;
        expandableListView.setAdapter(c10695vI2);
        expandableListView.setOnChildClickListener(this);
        expandableListView.setGroupIndicator(null);
        expandableListView.setOnGroupCollapseListener(this);
        expandableListView.setOnGroupExpandListener(this);
        expandableListView.setOnCreateContextMenuListener(this);
        viewGroup.addOnAttachStateChangeListener(this);
        if (!DeviceFormFactor.a(activity)) {
            this.a = cc;
            cc.d(this);
            int i = cc.o;
            int i2 = cc.p;
            h();
        } else {
            this.a = null;
        }
        d();
    }

    @Override // defpackage.InterfaceC2296Rr1
    public final void g(Canvas canvas) {
        ViewGroup viewGroup = this.i;
        Ge4.e(viewGroup);
        viewGroup.draw(canvas);
        this.l = false;
        ExpandableListView expandableListView = this.g;
        this.m = expandableListView.getFirstVisiblePosition();
        View childAt = expandableListView.getChildAt(0);
        this.n = childAt != null ? childAt.getTop() : 0;
        this.o = viewGroup.getWidth();
        this.p = viewGroup.getHeight();
    }

    @Override // defpackage.InterfaceC5451g12
    public final String getTitle() {
        return this.h;
    }

    @Override // defpackage.InterfaceC5451g12
    public final View a() {
        return this.i;
    }

    @Override // defpackage.InterfaceC5451g12
    public final void destroy() {
        C4857eI2 c4857eI2 = this.j;
        c4857eI2.t = true;
        C4857eI2.d(c4857eI2.x, "Tab");
        C4857eI2.d(c4857eI2.y, "Group");
        C4857eI2.d(c4857eI2.z, "Bulk");
        c4857eI2.w.l(c4857eI2);
        c4857eI2.r.f(c4857eI2);
        c4857eI2.r = null;
        c4857eI2.u.e(c4857eI2);
        AccountManagerFacadeProvider.getInstance().j(c4857eI2);
        WH0 wh0 = c4857eI2.l;
        N.Mz5mgjYL(wh0.a);
        wh0.a = 0L;
        c4857eI2.l = null;
        RecentlyClosedBridge recentlyClosedBridge = c4857eI2.q;
        N.MN6LZLAP(recentlyClosedBridge.a);
        recentlyClosedBridge.a = 0L;
        recentlyClosedBridge.c = null;
        c4857eI2.q = null;
        c4857eI2.s = null;
        C5545gI2 c5545gI2 = c4857eI2.p;
        N.M79sPWt6(c5545gI2.a);
        c5545gI2.a = 0L;
        c4857eI2.p = null;
        Object obj = ThreadUtils.a;
        if (T43.j == null) {
            T43.j = new T43(c4857eI2.a, new WP2());
        }
        T43 t43 = T43.j;
        int i = t43.i - 1;
        t43.i = i;
        if (i == 0) {
            t43.a(0L, false);
        }
        ForeignSessionHelper foreignSessionHelper = c4857eI2.m;
        N.MHB2z4$M(foreignSessionHelper.a);
        foreignSessionHelper.a = 0L;
        c4857eI2.m = null;
        this.j = null;
        this.k.notifyDataSetInvalidated();
        this.k = null;
        this.g.setAdapter((ExpandableListAdapter) null);
        this.i.removeOnAttachStateChangeListener(this);
        JC jc = this.a;
        if (jc != null) {
            ((CC) jc).g(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getRootView().requestLayout();
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        return this.k.getGroup(i).j(i2);
    }

    @Override // android.widget.ExpandableListView.OnGroupExpandListener
    public final void onGroupExpand(int i) {
        this.k.getGroup(i).m(false);
        this.l = true;
    }

    @Override // android.widget.ExpandableListView.OnGroupCollapseListener
    public final void onGroupCollapse(int i) {
        this.k.getGroup(i).m(true);
        this.l = true;
    }

    public final void d() {
        this.k.notifyDataSetChanged();
        for (int i = 0; i < this.k.getGroupCount(); i++) {
            boolean i2 = this.k.getGroup(i).i();
            ExpandableListView expandableListView = this.g;
            if (i2) {
                expandableListView.collapseGroup(i);
            } else {
                expandableListView.expandGroup(i);
            }
        }
        this.l = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        ExpandableListView.ExpandableListContextMenuInfo expandableListContextMenuInfo = (ExpandableListView.ExpandableListContextMenuInfo) contextMenuInfo;
        int packedPositionType = ExpandableListView.getPackedPositionType(expandableListContextMenuInfo.packedPosition);
        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(expandableListContextMenuInfo.packedPosition);
        if (packedPositionType == 0) {
            this.k.getGroup(packedPositionGroup).l(contextMenu);
        } else if (packedPositionType == 1) {
            this.k.getGroup(packedPositionGroup).k(ExpandableListView.getPackedPositionChild(expandableListContextMenuInfo.packedPosition), contextMenu);
        }
    }

    @Override // defpackage.InterfaceC2296Rr1
    public final boolean f() {
        ViewGroup viewGroup = this.i;
        if (viewGroup.getWidth() == 0 || viewGroup.getHeight() == 0) {
            return false;
        }
        ExpandableListView expandableListView = this.g;
        View childAt = expandableListView.getChildAt(0);
        if (!this.l && this.m == expandableListView.getFirstVisiblePosition()) {
            if (this.n == (childAt == null ? 0 : childAt.getTop()) && viewGroup.getWidth() == this.o && viewGroup.getHeight() == this.p) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.GC
    public final void k(int i) {
        h();
    }

    @Override // defpackage.GC
    public final void r() {
        h();
    }

    @Override // defpackage.GC
    public final void b(boolean z, int i, int i2, int i3) {
        h();
    }

    public final void h() {
        View findViewById = this.i.findViewById(R.id.recent_tabs_root);
        JC jc = this.a;
        int i = ((CC) jc).m;
        int i2 = ((CC) jc).t;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        int i3 = marginLayoutParams.topMargin;
        if (i2 < i) {
            i = i3;
        }
        findViewById.setTranslationY(i2 - i);
        int i4 = ((CC) jc).o;
        if (i == marginLayoutParams.topMargin && i4 == marginLayoutParams.bottomMargin) {
            return;
        }
        marginLayoutParams.topMargin = i;
        marginLayoutParams.bottomMargin = i4;
        findViewById.setLayoutParams(marginLayoutParams);
    }
}
