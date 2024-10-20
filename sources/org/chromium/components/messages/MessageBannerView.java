package org.chromium.components.messages;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C5590gR2;
import defpackage.LU1;
import defpackage.XC1;
import defpackage.ZC1;
import java.util.HashMap;
import org.chromium.base.SysUtils;
import org.chromium.components.browser_ui.widget.BoundedLinearLayout;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;
import org.chromium.components.browser_ui.widget.text.TextViewWithCompoundDrawables;
import org.chromium.components.messages.MessageBannerView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MessageBannerView extends BoundedLinearLayout {
    public ImageView k;
    public TextView l;
    public TextViewWithCompoundDrawables m;
    public int n;
    public TextView o;
    public View p;
    public ListMenuButton q;
    public View r;
    public String s;
    public Runnable t;
    public ZC1 u;
    public LU1 v;
    public Runnable w;
    public int x;
    public XC1 y;
    public Drawable z;

    public MessageBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = 0;
        this.x = -1;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.l = (TextView) findViewById(R.id.message_title);
        this.m = (TextViewWithCompoundDrawables) findViewById(R.id.message_description);
        this.o = (TextView) findViewById(R.id.message_primary_button);
        this.p = findViewById(R.id.message_primary_progress_spinner);
        this.k = (ImageView) findViewById(R.id.message_icon);
        this.q = (ListMenuButton) findViewById(R.id.message_secondary_button);
        this.r = findViewById(R.id.message_divider);
        this.q.setOnClickListener(new View.OnClickListener() { // from class: IU1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final MessageBannerView messageBannerView = MessageBannerView.this;
                ZC1 zc1 = messageBannerView.u;
                if (zc1 == null && messageBannerView.s == null) {
                    Runnable runnable = messageBannerView.t;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                ListMenuButton listMenuButton = messageBannerView.q;
                if (zc1 == null) {
                    HashMap e = PropertyModel.e(AbstractC4144cD1.j);
                    PD2 pd2 = AbstractC4144cD1.b;
                    String str = messageBannerView.s;
                    GD2 gd2 = new GD2();
                    gd2.a = str;
                    e.put(pd2, gd2);
                    LD2 ld2 = AbstractC4144cD1.f;
                    AD2 ad2 = new AD2();
                    ad2.a = true;
                    e.put(ld2, ad2);
                    final PropertyModel propertyModel = new PropertyModel(e);
                    C7616mK1 c7616mK1 = new C7616mK1();
                    c7616mK1.s(new C7272lK1(1, propertyModel));
                    zc1 = new KU1(new C4738dx(messageBannerView.getContext(), c7616mK1, new SC1(propertyModel) { // from class: JU1
                        @Override // defpackage.SC1
                        public final void b(PropertyModel propertyModel2) {
                            Runnable runnable2 = MessageBannerView.this.t;
                            if (runnable2 != null) {
                                runnable2.run();
                            }
                        }
                    }));
                }
                listMenuButton.e(zc1, true);
                XC1 xc1 = messageBannerView.y;
                if (xc1 != null) {
                    messageBannerView.q.n.a(xc1);
                }
                messageBannerView.q.f();
            }
        });
        if (SysUtils.isLowEndDevice()) {
            setBackgroundResource(R.drawable.f52090_resource_name_obfuscated_res_0x7f09040a);
        }
    }

    public final void a(boolean z) {
        if (this.z != null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.f35700_resource_name_obfuscated_res_0x7f0804df);
            if (z) {
                int intrinsicWidth = (this.z.getIntrinsicWidth() * dimensionPixelOffset) / this.z.getIntrinsicHeight();
                TextViewWithCompoundDrawables textViewWithCompoundDrawables = this.m;
                textViewWithCompoundDrawables.k = intrinsicWidth;
                textViewWithCompoundDrawables.g(textViewWithCompoundDrawables.getCompoundDrawables());
            } else {
                TextViewWithCompoundDrawables textViewWithCompoundDrawables2 = this.m;
                textViewWithCompoundDrawables2.k = dimensionPixelOffset;
                textViewWithCompoundDrawables2.g(textViewWithCompoundDrawables2.getCompoundDrawables());
            }
            this.m.setCompoundDrawablesRelative(this.z, null, null, null);
        }
    }

    public final void b(int i) {
        this.x = i;
        if (this.k.getDrawable() instanceof BitmapDrawable) {
            C5590gR2 c5590gR2 = new C5590gR2(getResources(), ((BitmapDrawable) this.k.getDrawable()).getBitmap());
            c5590gR2.b(i);
            this.k.setImageDrawable(c5590gR2);
        }
    }

    public final void c() {
        TextView textView = this.o;
        textView.setVisibility((this.n != 0 || TextUtils.isEmpty(textView.getText())) ? 8 : 0);
        this.p.setVisibility(this.n != 1 ? 8 : 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        LU1 lu1 = this.v;
        if (lu1 != null) {
            return lu1.a(motionEvent) || super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
}
