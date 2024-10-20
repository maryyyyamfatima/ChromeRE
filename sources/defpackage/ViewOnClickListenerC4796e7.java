package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.webapps.AddToHomescreenMediator;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4796e7 implements View.OnClickListener, InterfaceC3906bY1 {
    public final PropertyModel a;
    public final ZX1 g;
    public final InterfaceC7546m7 h;
    public final View i;
    public final EditText j;
    public final LinearLayout k;
    public final TextView l;
    public final TextView m;
    public final RatingBar n;
    public final ImageView o;
    public final View p;
    public final ImageView q;
    public boolean r;

    public ViewOnClickListenerC4796e7(Context context, ZX1 zx1, C1450Le c1450Le, AddToHomescreenMediator addToHomescreenMediator) {
        this.g = zx1;
        this.h = addToHomescreenMediator;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f55710_resource_name_obfuscated_res_0x7f0e0039, (ViewGroup) null);
        this.i = inflate;
        this.p = inflate.findViewById(R.id.spinny);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        this.q = imageView;
        EditText editText = (EditText) inflate.findViewById(R.id.text);
        this.j = editText;
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.app_info);
        this.k = linearLayout;
        TextView textView = (TextView) linearLayout.findViewById(R.id.name);
        this.l = textView;
        this.m = (TextView) linearLayout.findViewById(R.id.origin);
        this.n = (RatingBar) linearLayout.findViewById(R.id.control_rating);
        this.o = (ImageView) inflate.findViewById(R.id.play_logo);
        textView.setOnClickListener(this);
        imageView.setOnClickListener(this);
        inflate.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC4109c7(this));
        editText.addTextChangedListener(new C4453d7(this));
        Resources resources = context.getResources();
        BD2 bd2 = new BD2(AbstractC4249cY1.B);
        bd2.e(AbstractC4249cY1.a, this);
        bd2.d(AbstractC4249cY1.c, resources, c1450Le.a);
        bd2.d(AbstractC4249cY1.j, resources, c1450Le.b);
        bd2.b(AbstractC4249cY1.m, true);
        bd2.d(AbstractC4249cY1.n, resources, R.string.f69890_resource_name_obfuscated_res_0x7f1402f4);
        bd2.e(AbstractC4249cY1.h, inflate);
        bd2.b(AbstractC4249cY1.r, true);
        PropertyModel a = bd2.a();
        this.a = a;
        zx1.l(a, 1, false);
    }

    public final void b() {
        EditText editText = this.j;
        boolean z = true;
        boolean z2 = editText.getVisibility() == 0 && TextUtils.isEmpty(editText.getText());
        PropertyModel propertyModel = this.a;
        LD2 ld2 = AbstractC4249cY1.m;
        if (this.r && !z2) {
            z = false;
        }
        propertyModel.k(ld2, z);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if ((view == this.l || view == this.q) && this.h.a()) {
            this.g.c(3, this.a);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        int i2;
        if (i == 0) {
            this.h.b(this.j.getText().toString());
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.g.c(i2, this.a);
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        if (i == 1) {
            return;
        }
        this.h.c();
    }
}
