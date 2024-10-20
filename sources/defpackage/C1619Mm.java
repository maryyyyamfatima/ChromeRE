package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.RadioButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1619Mm extends AbstractC8305oK2 {
    public final List i;
    public final C2009Pm j;
    public final Context k;
    public int l;

    public C1619Mm(Context context, List list, C2009Pm c2009Pm) {
        this.i = list;
        this.j = c2009Pm;
        this.k = context;
    }

    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        return new C1490Lm(this, AbstractC9192qu3.a(recyclerView, R.layout.f55830_resource_name_obfuscated_res_0x7f0e0045, recyclerView, false), this.j);
    }

    @Override // defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
        C1490Lm c1490Lm = (C1490Lm) dVar;
        C1230Jm c1230Jm = (C1230Jm) this.i.get(i);
        int q = q();
        RadioButton radioButton = c1490Lm.C;
        ImageView imageView = c1490Lm.B;
        if (q == 1) {
            radioButton.setVisibility(8);
            int i2 = c1230Jm.d;
            if (i2 != 0) {
                imageView.setVisibility(0);
                Context context = this.k;
                Resources resources = context.getResources();
                Resources.Theme theme = context.getTheme();
                ThreadLocal threadLocal = GP2.a;
                imageView.setImageDrawable(resources.getDrawable(i2, theme));
            } else {
                imageView.setVisibility(8);
            }
        } else {
            imageView.setVisibility(8);
            radioButton.setVisibility(0);
            radioButton.setChecked(i == this.l);
        }
        c1490Lm.z.setText(c1230Jm.a);
        c1490Lm.A.setText(c1230Jm.c);
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        return this.i.size();
    }
}
