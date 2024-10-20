package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.home.rename.RenameDialogCustomView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VM2 {
    public final ZX1 a;
    public final PropertyModel b;
    public final RenameDialogCustomView c;
    public final Callback d;
    public final Callback e;

    public VM2(Context context, ZX1 zx1, ZM2 zm2, C3508aN2 c3508aN2) {
        this.a = zx1;
        RenameDialogCustomView renameDialogCustomView = (RenameDialogCustomView) LayoutInflater.from(context).inflate(R.layout.f57330_resource_name_obfuscated_res_0x7f0e00ed, (ViewGroup) null);
        this.c = renameDialogCustomView;
        BD2 bd2 = new BD2(AbstractC4249cY1.B);
        bd2.e(AbstractC4249cY1.a, new UM2(this));
        bd2.e(AbstractC4249cY1.c, context.getString(R.string.f84500_resource_name_obfuscated_res_0x7f140956));
        bd2.e(AbstractC4249cY1.h, renameDialogCustomView);
        bd2.d(AbstractC4249cY1.j, context.getResources(), R.string.f78930_resource_name_obfuscated_res_0x7f140717);
        bd2.d(AbstractC4249cY1.n, context.getResources(), R.string.f69890_resource_name_obfuscated_res_0x7f1402f4);
        this.b = bd2.a();
        this.d = zm2;
        this.e = c3508aN2;
        renameDialogCustomView.h = new Callback() { // from class: TM2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                VM2.this.b.k(AbstractC4249cY1.m, ((Boolean) obj).booleanValue());
            }
        };
    }

    public final void a(int i, String str) {
        RenameDialogCustomView renameDialogCustomView = this.c;
        if (i != 0) {
            renameDialogCustomView.a(str);
            renameDialogCustomView.b(true);
            renameDialogCustomView.a.setTextColor(renameDialogCustomView.getContext().getColor(R.color.f18050_resource_name_obfuscated_res_0x7f07013d));
            renameDialogCustomView.a.setVisibility(0);
            if (i == 1) {
                renameDialogCustomView.a.setText(R.string.f84530_resource_name_obfuscated_res_0x7f140959);
            } else if (i == 2) {
                renameDialogCustomView.a.setText(R.string.f84550_resource_name_obfuscated_res_0x7f14095b);
            } else if (i == 3) {
                renameDialogCustomView.a.setText(R.string.f84540_resource_name_obfuscated_res_0x7f14095a);
            } else if (i == 4) {
                renameDialogCustomView.a.setText(R.string.f84560_resource_name_obfuscated_res_0x7f14095c);
            }
        } else {
            renameDialogCustomView.getClass();
        }
        ZX1 zx1 = this.a;
        if (zx1.g()) {
            return;
        }
        zx1.l(this.b, 1, true);
    }
}
