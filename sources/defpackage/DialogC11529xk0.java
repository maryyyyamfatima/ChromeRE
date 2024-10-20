package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.widget.RadioButtonLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xk0 */
/* loaded from: classes.dex */
public final class DialogC11529xk0 extends OC2 {
    public static DialogC11529xk0 m;
    public final int i;
    public final Callback j;
    public final InterfaceC9814sk0 k;
    public ViewOnClickListenerC10157tk0 l;

    public DialogC11529xk0(Activity activity, InterfaceC9814sk0 interfaceC9814sk0, int i, Callback callback) {
        super(activity);
        this.k = interfaceC9814sk0;
        this.i = i;
        this.j = callback;
        setOnDismissListener(this);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        if (i == 2) {
            this.a.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(-1), new ColorDrawable(getContext().getColor(R.color.0_resource_name_obfuscated_res_0x7f070796))}));
        }
    }

    @Override // defpackage.OC2
    public final NC2 a() {
        NC2 nc2 = new NC2();
        nc2.b = R.string.0_resource_name_obfuscated_res_0x7f1409cb;
        nc2.d = R.string.0_resource_name_obfuscated_res_0x7f1409ca;
        nc2.e = R.string.0_resource_name_obfuscated_res_0x7f140717;
        return nc2;
    }

    @Override // defpackage.OC2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Button button = (Button) findViewById(R.id.button_primary);
        button.setEnabled(false);
        RadioButtonLayout radioButtonLayout = new RadioButtonLayout(getContext(), null);
        radioButtonLayout.setId(R.id.default_search_engine_dialog_options);
        this.g.m.addView(radioButtonLayout, new LinearLayout.LayoutParams(-1, -2));
        this.l = new ViewOnClickListenerC10157tk0(this.i, this.k, radioButtonLayout, button, new Runnable() { // from class: wk0
            @Override // java.lang.Runnable
            public final void run() {
                DialogC11529xk0.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        DialogC11529xk0 dialogC11529xk0 = m;
        if (dialogC11529xk0 != null) {
            dialogC11529xk0.dismiss();
        }
        m = this;
        int i = this.i;
        if (i == 2) {
            FI2.a("SearchEnginePromo.NewDevice.Shown.Dialog");
        } else if (i == 1) {
            FI2.a("SearchEnginePromo.ExistingDevice.Shown.Dialog");
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.l.l == null && getOwnerActivity() != null) {
            getOwnerActivity().finish();
        }
        Callback callback = this.j;
        if (callback != null) {
            callback.onResult(Boolean.valueOf(this.l.l != null));
        }
        if (m == this) {
            m = null;
        }
    }
}
