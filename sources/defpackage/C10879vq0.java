package defpackage;

import android.view.ContextThemeWrapper;
import android.view.View;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vq0 */
/* loaded from: classes.dex */
public final class C10879vq0 implements InterfaceC6007hf0 {
    @Override // defpackage.InterfaceC6007hf0
    public final int e(int i) {
        if (i == 0) {
            return R.layout.0_resource_name_obfuscated_res_0x7f0e00d3;
        }
        return -1;
    }

    @Override // defpackage.InterfaceC6007hf0
    public final int getItemViewType(int i) {
        return (i == R.id.divider_line_id || i == R.id.managed_by_divider_line_id) ? 0 : -1;
    }

    @Override // defpackage.InterfaceC6007hf0
    public final void getViewTypeCount() {
    }

    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        PropertyModel propertyModel = (PropertyModel) wd2;
        View view = (View) obj;
        FD2 fd2 = (FD2) obj2;
        AbstractC3968bj.a(propertyModel, view, fd2);
        ND2 nd2 = AbstractC1470Li.a;
        if (fd2 == nd2) {
            view.setId(propertyModel.h(nd2));
            view.setEnabled(false);
        }
    }

    @Override // defpackage.InterfaceC6007hf0
    public final int f(ContextThemeWrapper contextThemeWrapper) {
        return (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080636) * 2) + contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801c5);
    }
}
