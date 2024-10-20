package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Iu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1141Iu0 implements InterfaceC0751Fu0 {
    public final View a;
    public final Context g;
    public boolean h;
    public int i = -1;
    public final ViewOnLayoutChangeListenerC0881Gu0 j;
    public PopupWindow.OnDismissListener k;
    public CharSequence l;
    public final ListPopupWindow m;
    public View n;
    public ListAdapter o;

    public C1141Iu0(Context context, View view) {
        ListPopupWindow listPopupWindow = new ListPopupWindow(context, null, 0, R.style.f96270_resource_name_obfuscated_res_0x7f1501c1);
        this.m = listPopupWindow;
        this.a = view;
        view.setId(R.id.dropdown_popup_window);
        view.setTag(this);
        this.g = context;
        ViewOnLayoutChangeListenerC0881Gu0 viewOnLayoutChangeListenerC0881Gu0 = new ViewOnLayoutChangeListenerC0881Gu0(this);
        this.j = viewOnLayoutChangeListenerC0881Gu0;
        view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC0881Gu0);
        listPopupWindow.setOnDismissListener(new C1011Hu0(this));
        listPopupWindow.setAnchorView(view);
        Rect rect = new Rect();
        listPopupWindow.getBackground().getPadding(rect);
        listPopupWindow.setVerticalOffset(-rect.top);
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void f(ListAdapter listAdapter) {
        this.o = listAdapter;
        this.m.setAdapter(listAdapter);
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void j(int i) {
        this.i = i;
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void b() {
        ListPopupWindow listPopupWindow = this.m;
        listPopupWindow.setInputMethodMode(1);
        int a = AbstractC8540p04.a(this.o, null);
        View view = this.n;
        if (view != null) {
            if (view.getLayoutParams() == null) {
                this.n.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.n.measure(makeMeasureSpec, makeMeasureSpec);
            a = Math.max(this.n.getMeasuredWidth(), a);
        }
        View view2 = this.a;
        float f = view2.getLayoutParams().width;
        listPopupWindow.getBackground().getPadding(new Rect());
        if (r6.left + a + r6.right > f) {
            listPopupWindow.setContentWidth(a);
            Rect rect = new Rect();
            view2.getWindowVisibleDisplayFrame(rect);
            if (listPopupWindow.getWidth() > rect.width()) {
                listPopupWindow.setWidth(rect.width());
            }
        } else {
            listPopupWindow.setWidth(-2);
        }
        boolean isShowing = listPopupWindow.isShowing();
        listPopupWindow.show();
        listPopupWindow.getListView().setDividerHeight(0);
        listPopupWindow.getListView().setLayoutDirection(this.h ? 1 : 0);
        if (!isShowing) {
            listPopupWindow.getListView().setContentDescription(this.l);
            listPopupWindow.getListView().sendAccessibilityEvent(32);
        }
        if (this.i >= 0) {
            listPopupWindow.getListView().setSelection(this.i);
            this.i = -1;
        }
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void g(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void h(boolean z) {
        this.h = z;
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void m() {
        try {
            ListPopupWindow.class.getMethod("setForceIgnoreOutsideTouch", Boolean.TYPE).invoke(this.m, Boolean.TRUE);
        } catch (Exception e) {
            AbstractC4851eH1.a("AutofillPopup", "ListPopupWindow.setForceIgnoreOutsideTouch not found", e);
        }
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void i(String str) {
        this.l = str;
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void k(AdapterView.OnItemClickListener onItemClickListener) {
        this.m.setOnItemClickListener(onItemClickListener);
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void l(C11907yq c11907yq) {
        ListPopupWindow listPopupWindow = this.m;
        listPopupWindow.setPromptPosition(1);
        c11907yq.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View inflate = LayoutInflater.from(this.g).inflate(R.layout.f57370_resource_name_obfuscated_res_0x7f0e00f1, (ViewGroup) null);
        this.n = inflate;
        ((FrameLayout) inflate.findViewById(R.id.dropdown_footer)).addView(c11907yq);
        listPopupWindow.setPromptView(this.n);
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void e() {
        this.m.postShow();
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final void dismiss() {
        this.m.dismiss();
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final ListView d() {
        return this.m.getListView();
    }

    @Override // defpackage.InterfaceC0751Fu0
    public final boolean a() {
        return this.m.isShowing();
    }
}
