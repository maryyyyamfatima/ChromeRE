package defpackage;

import J.N;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.chrome.browser.ntp.ForeignSessionHelper;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vI2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10695vI2 extends BaseExpandableListAdapter {
    public final Activity a;
    public final ArrayList b;
    public final VH0 c;
    public final C4857eI2 d;
    public final C9323rI2 e = new C9323rI2(this);
    public final C9666sI2 f = new C9666sI2(this, true);
    public final C9666sI2 g = new C9666sI2(this, false);
    public final ArrayMap h;
    public final int i;
    public boolean j;
    public final C6964kR2 k;

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public final int getChildTypeCount() {
        return 5;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public final int getGroupTypeCount() {
        return 3;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public C10695vI2(Activity activity, C4857eI2 c4857eI2) {
        ArrayMap arrayMap = new ArrayMap(2);
        this.h = arrayMap;
        this.a = activity;
        this.d = c4857eI2;
        this.b = new ArrayList();
        arrayMap.put(0, new C6233iI2());
        arrayMap.put(1, new C6233iI2());
        Resources resources = activity.getResources();
        this.c = new VH0();
        this.i = resources.getDimensionPixelSize(R.dimen.f30480_resource_name_obfuscated_res_0x7f08017a);
        this.k = AbstractC4855eI0.a(activity);
        EI2.h(0, 11, "HistoryPage.OtherDevicesMenu");
    }

    public static void a(C10695vI2 c10695vI2, C10352uI2 c10352uI2, GURL gurl, int i) {
        Drawable drawable;
        Activity activity = c10695vI2.a;
        VH0 vh0 = c10695vI2.c;
        if (gurl != null) {
            Drawable drawable2 = (Drawable) ((C6233iI2) c10695vI2.h.get(Integer.valueOf(i))).a.get(gurl);
            if (drawable2 == null) {
                C5889hI2 c5889hI2 = new C5889hI2(c10695vI2, c10352uI2, gurl, i);
                c10352uI2.e = c5889hI2;
                C4857eI2 c4857eI2 = c10695vI2.d;
                if (i == 0) {
                    WH0 wh0 = c4857eI2.l;
                    wh0.getClass();
                    wh0.a(c4857eI2.a, gurl.i(), c10695vI2.i, c5889hI2);
                } else if (i == 1) {
                    int i2 = c10695vI2.i;
                    WH0 wh02 = c4857eI2.l;
                    N.MNHvfXi1(wh02.a, c4857eI2.a, gurl, i2, c5889hI2);
                }
                Resources resources = activity.getResources();
                vh0.getClass();
                drawable = new BitmapDrawable(resources, vh0.b(resources, gurl, true));
            } else {
                drawable = drawable2;
            }
        } else {
            Resources resources2 = activity.getResources();
            vh0.getClass();
            drawable = new BitmapDrawable(resources2, vh0.b(resources2, gurl, true));
        }
        c10352uI2.c.setImageDrawable(drawable);
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        return getGroup(i).e(i2, view, viewGroup);
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.b.size();
    }

    @Override // android.widget.ExpandableListAdapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC7951nI2 getGroup(int i) {
        return (AbstractC7951nI2) this.b.get(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        return getGroup(i).h(z, view, viewGroup);
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        return getGroup(i).f();
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        return getGroup(i).c(i2);
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public final int getGroupType(int i) {
        return getGroup(i).g();
    }

    public final void b(AbstractC7951nI2 abstractC7951nI2) {
        boolean a = DeviceFormFactor.a(this.a);
        ArrayList arrayList = this.b;
        if (!a) {
            arrayList.add(abstractC7951nI2);
            return;
        }
        int size = arrayList.size();
        C9666sI2 c9666sI2 = this.g;
        if (size == 0) {
            arrayList.add(c9666sI2);
        }
        arrayList.add(abstractC7951nI2);
        arrayList.add(c9666sI2);
    }

    @Override // android.widget.BaseExpandableListAdapter
    public final void notifyDataSetChanged() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        C9323rI2 c9323rI2 = this.e;
        b(c9323rI2);
        C4857eI2 c4857eI2 = this.d;
        for (ForeignSessionHelper.ForeignSession foreignSession : c4857eI2.n) {
            if (!this.j) {
                EI2.h(9, 11, "HistoryPage.OtherDevicesMenu");
                this.j = true;
            }
            b(new C7607mI2(this, foreignSession));
        }
        int i = c4857eI2.k;
        if (i != 0) {
            if (i == 1) {
                b(new C8295oI2(this, 2));
            } else if (i == 2) {
                b(new C8295oI2(this, 3));
            } else if (i == 3) {
                b(new C10009tI2(this));
            }
        }
        int indexOf = arrayList.indexOf(c9323rI2);
        if (DeviceFormFactor.a(this.a) && indexOf != arrayList.size() - 2) {
            arrayList.set(indexOf + 1, this.f);
        }
        super.notifyDataSetChanged();
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public final int getChildType(int i, int i2) {
        return ((AbstractC7951nI2) this.b.get(i)).d();
    }
}
