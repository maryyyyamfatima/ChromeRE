package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sT1 */
/* loaded from: classes.dex */
public abstract class AbstractC9720sT1 implements Q93, InterfaceC12121zT1, AdapterView.OnItemClickListener {
    public Rect a;

    @Override // defpackage.InterfaceC12121zT1
    public final boolean g(C6287iT1 c6287iT1) {
        return false;
    }

    @Override // defpackage.InterfaceC12121zT1
    public final boolean i(C6287iT1 c6287iT1) {
        return false;
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void k(Context context, BS1 bs1) {
    }

    public abstract void l(BS1 bs1);

    public abstract void n(View view);

    public abstract void o(boolean z);

    public abstract void p(int i);

    public abstract void q(int i);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z);

    public abstract void t(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C11773yS1 c11773yS1;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            c11773yS1 = (C11773yS1) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            c11773yS1 = (C11773yS1) listAdapter;
        }
        c11773yS1.a.q((MenuItem) listAdapter.getItem(i), this, (this instanceof TG) ^ true ? 0 : 4);
    }

    public static int m(C11773yS1 c11773yS1, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = c11773yS1.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = c11773yS1.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = c11773yS1.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean u(BS1 bs1) {
        int size = bs1.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = bs1.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
