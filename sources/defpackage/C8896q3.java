package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ButtonCompat;
import org.chromium.ui.widget.TextViewWithLeading;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q3 */
/* loaded from: classes2.dex */
public final class C8896q3 implements PB {
    public static final int[] m = {R.id.account_picker_header_title, R.id.account_picker_header_title, R.id.account_picker_header_title, R.id.account_picker_signin_in_progress_title, R.id.account_picker_general_error_title, R.id.account_picker_auth_error_title};
    public final Activity a;
    public final C7522m3 g;
    public final View h;
    public final ViewFlipper i;
    public final RecyclerView j;
    public final View k;
    public final ButtonCompat l;

    @Override // defpackage.PB
    public final int a() {
        return 0;
    }

    @Override // defpackage.PB
    public final int b() {
        return 0;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // defpackage.PB
    public final void destroy() {
    }

    @Override // defpackage.PB
    public final View e() {
        return null;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.PB
    public final int g() {
        return R.string.0_resource_name_obfuscated_res_0x7f1401a9;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.PB
    public final int l() {
        return R.string.0_resource_name_obfuscated_res_0x7f1401a8;
    }

    @Override // defpackage.PB
    public final int m() {
        return -2;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // defpackage.PB
    public final int q() {
        return R.string.0_resource_name_obfuscated_res_0x7f140a53;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // defpackage.PB
    public final int s() {
        return R.string.0_resource_name_obfuscated_res_0x7f1401a9;
    }

    @Override // defpackage.PB
    public final float t() {
        return -1.0f;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.PB
    public final boolean v() {
        return true;
    }

    public C8896q3(Activity activity, C7522m3 c7522m3) {
        this.a = activity;
        this.g = c7522m3;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0026, (ViewGroup) null);
        this.h = inflate;
        ViewFlipper viewFlipper = (ViewFlipper) inflate.findViewById(R.id.account_picker_state_view_flipper);
        this.i = viewFlipper;
        i(viewFlipper, 0, R.id.account_picker_state_no_account);
        i(viewFlipper, 1, R.id.account_picker_state_collapsed);
        i(viewFlipper, 2, R.id.account_picker_state_expanded);
        i(viewFlipper, 3, R.id.account_picker_state_signin_in_progress);
        i(viewFlipper, 4, R.id.account_picker_state_general_error);
        i(viewFlipper, 5, R.id.account_picker_state_auth_error);
        RecyclerView recyclerView = (RecyclerView) viewFlipper.getChildAt(2).findViewById(R.id.account_picker_account_list);
        this.j = recyclerView;
        recyclerView.getContext();
        recyclerView.q0(new LinearLayoutManager(1, false));
        this.k = viewFlipper.getChildAt(1).findViewById(R.id.account_picker_selected_account);
        this.l = (ButtonCompat) viewFlipper.getChildAt(1).findViewById(R.id.account_picker_dismiss_button);
        ((ButtonCompat) viewFlipper.getChildAt(0).findViewById(R.id.account_picker_continue_as_button)).setText(R.string.0_resource_name_obfuscated_res_0x7f140a5b);
        ((ButtonCompat) viewFlipper.getChildAt(4).findViewById(R.id.account_picker_continue_as_button)).setText(R.string.0_resource_name_obfuscated_res_0x7f140a58);
        ((ButtonCompat) viewFlipper.getChildAt(5).findViewById(R.id.account_picker_continue_as_button)).setText(R.string.0_resource_name_obfuscated_res_0x7f1401fb);
    }

    @Override // defpackage.PB
    public final boolean h() {
        PropertyModel propertyModel = this.g.j;
        ND2 nd2 = AbstractC8553p3.e;
        if (propertyModel.h(nd2) != 2) {
            return false;
        }
        propertyModel.m(nd2, 1);
        return true;
    }

    @Override // defpackage.PB
    public final void onBackPressed() {
        PropertyModel propertyModel = this.g.j;
        ND2 nd2 = AbstractC8553p3.e;
        if (propertyModel.h(nd2) == 2) {
            propertyModel.m(nd2, 1);
        }
    }

    @Override // defpackage.PB
    public final C8385oa2 o() {
        return this.g.p;
    }

    @Override // defpackage.PB
    public final View c() {
        return this.h;
    }

    public final void w(int i) {
        View childAt = this.i.getChildAt(i);
        ((TextView) childAt.findViewById(R.id.account_picker_header_title)).setText(R.string.0_resource_name_obfuscated_res_0x7f140a55);
        ((TextViewWithLeading) childAt.findViewById(R.id.account_picker_header_subtitle)).setText(R.string.0_resource_name_obfuscated_res_0x7f140a54);
    }

    public static void i(ViewFlipper viewFlipper, int i, int i2) {
        if (viewFlipper.getChildAt(i).getId() != i2) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("Match failed with ViewState:", i));
        }
    }
}
