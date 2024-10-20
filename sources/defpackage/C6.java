package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ListView;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6 implements View.OnLongClickListener {
    public final /* synthetic */ G6 a;
    public final /* synthetic */ Callback g;

    public /* synthetic */ C6(G6 g6, J6 j6) {
        this.a = g6;
        this.g = j6;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [D6] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        G6 g6 = this.a;
        g6.getClass();
        Context context = view.getContext();
        ListMenuButton listMenuButton = (ListMenuButton) view;
        C7616mK1 c7616mK1 = new C7616mK1();
        c7616mK1.s(C4738dx.e(R.string.f67190_resource_name_obfuscated_res_0x7f1401c4, R.id.customize_adaptive_button_menu_id, 0, true));
        final Callback callback = this.g;
        final ?? r3 = new Callback() { // from class: D6
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Callback.this.onResult((Integer) obj);
            }
        };
        ViewTreeObserverOnGlobalLayoutListenerC8754pe4 a = CS1.a(listMenuButton);
        g6.a = new C4738dx(context, c7616mK1, new SC1() { // from class: E6
            @Override // defpackage.SC1
            public final void b(PropertyModel propertyModel) {
                r3.onResult(Integer.valueOf(propertyModel.h(AbstractC4144cD1.e)));
            }
        });
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.f28070_resource_name_obfuscated_res_0x7f080061);
        ListView listView = g6.a.a;
        listView.setPaddingRelative(listView.getPaddingStart(), dimensionPixelOffset, listView.getPaddingEnd(), dimensionPixelOffset);
        listMenuButton.e(new F6(g6, a), false);
        listMenuButton.f();
        FI2.a("MobileAdaptiveMenuShown");
        return true;
    }
}
