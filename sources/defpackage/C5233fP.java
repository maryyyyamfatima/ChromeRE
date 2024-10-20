package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.text.NumberFormat;
import org.chromium.components.browser_ui.contacts_picker.TopView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fP */
/* loaded from: classes.dex */
public final class C5233fP extends AbstractC6099hu2 implements InterfaceC9979tC2 {
    public final C10322uC2 w;
    public boolean x;
    public boolean y;

    public C5233fP(Context context) {
        this.w = new C10322uC2(context, context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080132), null);
    }

    @Override // defpackage.InterfaceC9979tC2
    public final void u(String str) {
        if (this.y && TextUtils.equals(str, this.o)) {
            this.y = false;
            boolean z = this.x;
            C10322uC2 c10322uC2 = this.w;
            if (z) {
                this.x = false;
                c10322uC2.e(this);
            }
            ((A40) this.n.get(0)).m = c10322uC2.c(this.o).b;
            TopView topView = this.k;
            if (topView != null) {
                topView.i.setText(NumberFormat.getInstance().format(this.n.size()));
            }
            t();
        }
    }

    @Override // defpackage.AbstractC8305oK2
    public final void A(RecyclerView recyclerView) {
        if (this.x) {
            return;
        }
        this.x = true;
        this.w.a(this);
    }

    @Override // defpackage.AbstractC8305oK2
    public final void F(RecyclerView recyclerView) {
        if (this.x) {
            this.x = false;
            this.w.e(this);
        }
    }
}
