package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yv3 */
/* loaded from: classes.dex */
public final class C3228Yv3 {
    public final Context a;
    public final ComponentCallbacksC2968Wv3 b;
    public final Callback c;
    public T8 d;

    public C3228Yv3(Context context, View view, Callback callback) {
        this.a = context;
        this.c = callback;
        ComponentCallbacksC2968Wv3 componentCallbacksC2968Wv3 = new ComponentCallbacksC2968Wv3(this);
        this.b = componentCallbacksC2968Wv3;
        context.registerComponentCallbacks(componentCallbacksC2968Wv3);
        View inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02b0, (ViewGroup) null);
        ListView listView = (ListView) inflate.findViewById(R.id.tab_switcher_action_menu_list);
        C7616mK1 c7616mK1 = new C7616mK1();
        c7616mK1.s(new C7272lK1(0, a(R.string.0_resource_name_obfuscated_res_0x7f140b12, R.id.ungroup_tab, context)));
        if (CachedFeatureFlags.b(AbstractC6265iP.d.b("TabGroupsContinuationAndroid:enable_tab_group_sharing"), false)) {
            c7616mK1.s(new C7272lK1(0, a(R.string.0_resource_name_obfuscated_res_0x7f140b13, R.id.share_tab_group, context)));
        }
        if (AbstractC5177fD3.c()) {
            c7616mK1.s(new C7272lK1(0, a(R.string.0_resource_name_obfuscated_res_0x7f140b11, R.id.edit_group_name, context)));
        }
        C3098Xv3 c3098Xv3 = new C3098Xv3(c7616mK1);
        listView.setAdapter((ListAdapter) c3098Xv3);
        c3098Xv3.a(0, new C2591Ty1(R.layout.0_resource_name_obfuscated_res_0x7f0e016c), new TD2() { // from class: Tv3
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                View view2 = (View) obj;
                FD2 fd2 = (FD2) obj2;
                PD2 pd2 = AbstractC3358Zv3.a;
                if (fd2 == pd2) {
                    ((TextView) view2.findViewById(R.id.menu_item_text)).setText((CharSequence) propertyModel.i(pd2));
                }
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: Uv3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                C3228Yv3 c3228Yv3 = C3228Yv3.this;
                Callback callback2 = c3228Yv3.c;
                if (callback2 != null) {
                    callback2.onResult(Integer.valueOf((int) j));
                }
                c3228Yv3.d.b();
            }
        });
        T8 t8 = new T8(context, ((Activity) inflate.getContext()).getWindow().getDecorView(), AbstractC2884Wf.a(context, R.drawable.0_resource_name_obfuscated_res_0x7f090392), inflate, new ViewTreeObserverOnGlobalLayoutListenerC8754pe4(view));
        this.d = t8;
        t8.k.setFocusable(true);
        T8 t82 = this.d;
        t82.y = true;
        t82.x = true;
        t82.d(R.style.f96280_resource_name_obfuscated_res_0x7f1501c2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0804d6);
        T8 t83 = this.d;
        t83.s = dimensionPixelSize;
        t83.a(new PopupWindow.OnDismissListener() { // from class: Vv3
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C3228Yv3 c3228Yv3 = C3228Yv3.this;
                c3228Yv3.a.unregisterComponentCallbacks(c3228Yv3.b);
            }
        });
    }

    public static PropertyModel a(int i, int i2, Context context) {
        HashMap e = PropertyModel.e(AbstractC3358Zv3.c);
        PD2 pd2 = AbstractC3358Zv3.a;
        String string = context.getString(i);
        GD2 gd2 = new GD2();
        gd2.a = string;
        e.put(pd2, gd2);
        ND2 nd2 = AbstractC3358Zv3.b;
        DD2 dd2 = new DD2();
        dd2.a = i2;
        e.put(nd2, dd2);
        return new PropertyModel(e);
    }
}
