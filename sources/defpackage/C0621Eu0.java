package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Eu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0621Eu0 implements R8, InterfaceC0751Fu0 {
    public final Context a;
    public final View g;
    public boolean h;
    public int i = -1;
    public final ViewOnLayoutChangeListenerC0361Cu0 j;
    public CharSequence k;
    public final T8 l;
    public ListAdapter m;
    public final LinearLayout n;
    public final ListView o;
    public final FrameLayout p;
    public final Drawable q;
    public final int r;

    public C0621Eu0(Context context, View view) {
        this.a = context;
        this.g = view;
        view.setId(R.id.dropdown_popup_window);
        view.setTag(this);
        ViewOnLayoutChangeListenerC0361Cu0 viewOnLayoutChangeListenerC0361Cu0 = new ViewOnLayoutChangeListenerC0361Cu0(this);
        this.j = viewOnLayoutChangeListenerC0361Cu0;
        view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC0361Cu0);
        C0491Du0 c0491Du0 = new C0491Du0(this);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.f57390_resource_name_obfuscated_res_0x7f0e00f3, (ViewGroup) null);
        this.n = linearLayout;
        this.o = (ListView) linearLayout.findViewById(R.id.dropdown_body_list);
        this.p = (FrameLayout) linearLayout.findViewById(R.id.dropdown_footer);
        ViewTreeObserverOnGlobalLayoutListenerC8754pe4 viewTreeObserverOnGlobalLayoutListenerC8754pe4 = new ViewTreeObserverOnGlobalLayoutListenerC8754pe4(view);
        viewTreeObserverOnGlobalLayoutListenerC8754pe4.d(true);
        Drawable a = AbstractC2884Wf.a(context, R.drawable.f51240_resource_name_obfuscated_res_0x7f090390);
        this.q = a;
        T8 t8 = new T8(context, view, a, linearLayout, viewTreeObserverOnGlobalLayoutListenerC8754pe4);
        this.l = t8;
        t8.a(c0491Du0);
        t8.q = this;
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f31320_resource_name_obfuscated_res_0x7f0801dd);
        PopupWindow popupWindow = t8.k;
        popupWindow.setElevation(dimensionPixelSize);
        Rect rect = new Rect();
        a.getPadding(rect);
        viewTreeObserverOnGlobalLayoutListenerC8754pe4.e(new Rect(0, rect.bottom, 0, rect.top));
        this.r = rect.right + rect.left;
        t8.v = 1;
        t8.z = true;
        popupWindow.setOutsideTouchable(true);
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void f(ListAdapter listAdapter) {
        this.m = listAdapter;
        this.o.setAdapter(listAdapter);
        this.l.f();
    }

    @Override // defpackage.R8
    public final void c(boolean z, int i, int i2, Rect rect) {
        this.q.setBounds(rect);
        this.l.k.setBackgroundDrawable(AbstractC2884Wf.a(this.a, R.drawable.f51240_resource_name_obfuscated_res_0x7f090390));
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void j(int i) {
        this.i = i;
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void b() {
        T8 t8 = this.l;
        boolean c = t8.c();
        t8.x = false;
        t8.y = true;
        int i = this.a.getResources().getDisplayMetrics().widthPixels;
        int a = AbstractC8540p04.a(this.m, null);
        FrameLayout frameLayout = this.p;
        if (frameLayout.getChildCount() > 0) {
            if (frameLayout.getLayoutParams() == null) {
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            frameLayout.measure(makeMeasureSpec, makeMeasureSpec);
            a = Math.max(frameLayout.getMeasuredWidth(), a);
        }
        int i2 = this.r;
        int i3 = a + i2;
        if (i >= i3) {
            View view = this.g;
            if (view.getWidth() < a) {
                t8.s = i3;
            } else {
                t8.s = view.getWidth() + i2;
            }
        } else {
            t8.s = i - i2;
        }
        t8.e();
        ListView listView = this.o;
        listView.setDividerHeight(0);
        listView.setLayoutDirection(this.h ? 1 : 0);
        if (!c) {
            listView.setContentDescription(this.k);
            listView.sendAccessibilityEvent(32);
        }
        int i4 = this.i;
        if (i4 >= 0) {
            listView.setSelection(i4);
            this.i = -1;
        }
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void g(PopupWindow.OnDismissListener onDismissListener) {
        this.l.a(onDismissListener);
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void h(boolean z) {
        this.h = z;
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void i(String str) {
        this.k = str;
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void k(AdapterView.OnItemClickListener onItemClickListener) {
        this.o.setOnItemClickListener(onItemClickListener);
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void l(C11907yq c11907yq) {
        this.n.findViewById(R.id.dropdown_body_footer_divider).setVisibility(0);
        FrameLayout frameLayout = this.p;
        frameLayout.removeAllViews();
        frameLayout.addView(c11907yq);
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void e() {
        this.l.e();
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void dismiss() {
        this.l.b();
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final ListView d() {
        return this.o;
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final boolean a() {
        return this.l.c();
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void m() {
        T8 t8 = this.l;
        t8.n = false;
        t8.k.setOutsideTouchable(false);
    }
}
