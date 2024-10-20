package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.WindowManager;
import com.android.chrome.R;
import org.chromium.components.browser_ui.modaldialog.ModalDialogView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ej */
/* loaded from: classes2.dex */
public final class C4998ej extends YX1 {
    public final Context h;
    public DialogC8536p00 i;
    public UD2 j;

    public C4998ej(Context context) {
        this.h = context;
    }

    @Override // defpackage.YX1
    public final void c(PropertyModel propertyModel) {
        char c;
        int[][] iArr = {new int[]{R.style.f105320_resource_name_obfuscated_res_0x7f150551, R.style.f105340_resource_name_obfuscated_res_0x7f150553, R.style.f105330_resource_name_obfuscated_res_0x7f150552}, new int[]{R.style.f105290_resource_name_obfuscated_res_0x7f15054e, R.style.f105310_resource_name_obfuscated_res_0x7f150550, R.style.f105300_resource_name_obfuscated_res_0x7f15054f}, new int[]{R.style.f105260_resource_name_obfuscated_res_0x7f15054b, R.style.f105280_resource_name_obfuscated_res_0x7f15054d, R.style.f105270_resource_name_obfuscated_res_0x7f15054c}};
        if (propertyModel.j(AbstractC4249cY1.w)) {
            c = 1;
        } else {
            c = propertyModel.j(AbstractC4249cY1.x) ? (char) 2 : (char) 0;
        }
        int h = propertyModel.h(AbstractC4249cY1.v);
        DialogC8536p00 dialogC8536p00 = new DialogC8536p00(this.h, iArr[h != 1 ? h == 2 ? (char) 2 : (char) 0 : (char) 1][c]);
        this.i = dialogC8536p00;
        dialogC8536p00.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: cj
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C4998ej.this.d(5);
            }
        });
        this.i.setCanceledOnTouchOutside(false);
        ModalDialogView modalDialogView = (ModalDialogView) AbstractC3236Yx1.a(R.layout.0_resource_name_obfuscated_res_0x7f0e0186, this.i.getContext(), null);
        this.j = UD2.a(propertyModel, modalDialogView, new C4655dj(this));
        C7432ln3 c2 = C7432ln3.c();
        try {
            this.i.setContentView(modalDialogView);
            c2.close();
            try {
                this.i.show();
                String str = (String) propertyModel.i(AbstractC4249cY1.b);
                if (str == null) {
                    str = (String) propertyModel.i(AbstractC4249cY1.c);
                }
                modalDialogView.announceForAccessibility(str);
            } catch (WindowManager.BadTokenException unused) {
                d(9);
            }
        } catch (Throwable th) {
            try {
                c2.close();
            } catch (Throwable unused2) {
            }
            throw th;
        }
    }

    @Override // defpackage.YX1
    public final void f() {
        UD2 ud2 = this.j;
        if (ud2 != null) {
            ud2.b();
            this.j = null;
        }
        DialogC8536p00 dialogC8536p00 = this.i;
        if (dialogC8536p00 != null) {
            dialogC8536p00.dismiss();
            this.i = null;
        }
    }
}
