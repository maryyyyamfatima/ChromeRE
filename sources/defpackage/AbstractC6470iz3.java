package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.android.chrome.R;
import org.chromium.components.browser_ui.modaldialog.ModalDialogView;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iz3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6470iz3 extends YX1 {
    public final Context h;
    public ViewGroup i;
    public ModalDialogView j;
    public UD2 k;
    public boolean l;
    public boolean m;

    public abstract void i(boolean z);

    public abstract void j(boolean z);

    public final void h(WebContents webContents, boolean z) {
        if (z) {
            SelectionPopupControllerImpl k = SelectionPopupControllerImpl.k(webContents);
            k.K = true;
            webContents.C().getContainerView().clearFocus();
            k.C(false);
            this.l = true;
            return;
        }
        if (this.l) {
            this.l = false;
            SelectionPopupControllerImpl.k(webContents).C(true);
        }
    }

    public AbstractC6470iz3(Context context) {
        this.h = context;
    }

    @Override // defpackage.YX1
    public final void c(PropertyModel propertyModel) {
        if (this.i == null) {
            C9018qQ c9018qQ = (C9018qQ) this;
            Activity activity = c9018qQ.n;
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.tab_modal_dialog_container_stub);
            viewStub.setLayoutResource(R.layout.f58770_resource_name_obfuscated_res_0x7f0e0184);
            ViewGroup viewGroup = (ViewGroup) viewStub.inflate();
            viewGroup.setVisibility(8);
            viewGroup.setClickable(true);
            c9018qQ.w = (ViewGroup) viewGroup.getParent();
            c9018qQ.z = activity.findViewById(R.id.tab_modal_dialog_container_sibling_view);
            Resources resources = activity.getResources();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f41460_resource_name_obfuscated_res_0x7f0807af);
            CC cc = (CC) c9018qQ.s;
            marginLayoutParams.topMargin = cc.m - dimensionPixelSize;
            marginLayoutParams.bottomMargin = cc.o;
            viewGroup.setLayoutParams(marginLayoutParams);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f41460_resource_name_obfuscated_res_0x7f0807af);
            View findViewById = viewGroup.findViewById(R.id.scrim);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = -1;
            marginLayoutParams2.topMargin = dimensionPixelSize2;
            findViewById.setLayoutParams(marginLayoutParams2);
            this.i = viewGroup;
        }
        int h = propertyModel.h(AbstractC4249cY1.v);
        ModalDialogView modalDialogView = (ModalDialogView) AbstractC3236Yx1.a(R.layout.f58790_resource_name_obfuscated_res_0x7f0e0186, new ContextThemeWrapper(this.h, h == 1 ? R.style.f105290_resource_name_obfuscated_res_0x7f15054e : h == 2 ? R.style.f105260_resource_name_obfuscated_res_0x7f15054b : R.style.f105320_resource_name_obfuscated_res_0x7f150551), null);
        this.j = modalDialogView;
        this.k = UD2.a(propertyModel, modalDialogView, new C6128hz3(this));
        i(true);
        C9018qQ c9018qQ2 = (C9018qQ) this;
        boolean z = c9018qQ2.B;
        JC jc = c9018qQ2.s;
        if (z) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) c9018qQ2.i.getLayoutParams();
            marginLayoutParams3.topMargin = ((CC) jc).m - c9018qQ2.n.getResources().getDimensionPixelSize(R.dimen.f41460_resource_name_obfuscated_res_0x7f0807af);
            marginLayoutParams3.bottomMargin = c9018qQ2.A;
            c9018qQ2.i.setLayoutParams(marginLayoutParams3);
            c9018qQ2.B = false;
        }
        if (HC.a(jc)) {
            c9018qQ2.g();
        } else {
            c9018qQ2.y = true;
        }
        c9018qQ2.C = ((C1948Oz3) c9018qQ2.o.get()).a.a();
    }

    public final void g() {
        this.i.animate().cancel();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
        this.j.setBackgroundResource(R.drawable.f46060_resource_name_obfuscated_res_0x7f09015e);
        this.i.addView(this.j, layoutParams);
        this.i.setAlpha(0.0f);
        this.i.setVisibility(0);
        this.i.animate().setDuration(200L).alpha(1.0f).setInterpolator(InterpolatorC0485Dt.e).setListener(new C5096ez3(this)).start();
    }
}
