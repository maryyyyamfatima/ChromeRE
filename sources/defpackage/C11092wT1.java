package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wT1 */
/* loaded from: classes.dex */
public final class C11092wT1 extends C5753gu0 {
    public final int s;
    public final int t;
    public InterfaceC5599gT1 u;
    public C6287iT1 v;

    public C11092wT1(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.s = 21;
            this.t = 22;
        } else {
            this.s = 22;
            this.t = 21;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C11773yS1 c11773yS1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.s) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i == this.t) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                c11773yS1 = (C11773yS1) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                c11773yS1 = (C11773yS1) adapter;
            }
            c11773yS1.a.c(false);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.C5753gu0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C11773yS1 c11773yS1;
        int i;
        int pointToPosition;
        int i2;
        if (this.u != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c11773yS1 = (C11773yS1) headerViewListAdapter.getWrappedAdapter();
            } else {
                c11773yS1 = (C11773yS1) adapter;
                i = 0;
            }
            C6287iT1 item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c11773yS1.getCount()) ? null : c11773yS1.getItem(i2);
            C6287iT1 c6287iT1 = this.v;
            if (c6287iT1 != item) {
                BS1 bs1 = c11773yS1.a;
                if (c6287iT1 != null) {
                    this.u.h(bs1, c6287iT1);
                }
                this.v = item;
                if (item != null) {
                    this.u.l(bs1, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
