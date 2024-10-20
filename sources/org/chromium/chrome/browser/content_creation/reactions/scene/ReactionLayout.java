package org.chromium.chrome.browser.content_creation.reactions.scene;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.chrome.R;
import defpackage.C10690vH2;
import defpackage.C9661sH2;
import defpackage.InterfaceC3553aW2;
import defpackage.ViewOnTouchListenerC11033wH2;
import defpackage.ViewOnTouchListenerC11376xH2;
import defpackage.ZV2;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.content_creation.reactions.scene.ReactionLayout;
import org.chromium.components.content_creation.reactions.ReactionMetadata;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ReactionLayout extends RelativeLayout {
    public final int a;
    public final Context g;
    public ChromeImageButton h;
    public ChromeImageButton i;
    public ChromeImageButton j;
    public C9661sH2 k;
    public ImageView l;
    public InterfaceC3553aW2 m;
    public boolean n;

    public ReactionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = context;
        this.a = context.getResources().getDimensionPixelSize(R.dimen.f39600_resource_name_obfuscated_res_0x7f0806eb);
    }

    public final void a(C9661sH2 c9661sH2, ZV2 zv2, String str) {
        this.k = c9661sH2;
        this.l.setImageDrawable(c9661sH2);
        this.l.setContentDescription(str);
        this.m = zv2;
        this.n = true;
        this.l.setOnTouchListener(new ViewOnTouchListenerC11033wH2(this, new GestureDetector(this.g, new C10690vH2(this))));
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.l = (ImageView) findViewById(R.id.reaction_view);
        ChromeImageButton chromeImageButton = (ChromeImageButton) findViewById(R.id.adjust_button);
        this.h = chromeImageButton;
        chromeImageButton.setOnTouchListener(new ViewOnTouchListenerC11376xH2(this));
        ChromeImageButton chromeImageButton2 = (ChromeImageButton) findViewById(R.id.copy_button);
        this.i = chromeImageButton2;
        ((LayerDrawable) chromeImageButton2.getDrawable()).findDrawableByLayerId(R.id.icon).mutate().setTint(getContext().getColor(R.color.f16920_resource_name_obfuscated_res_0x7f070094));
        this.i.setOnClickListener(new View.OnClickListener() { // from class: uH2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final ReactionLayout reactionLayout = ReactionLayout.this;
                ZV2 zv2 = (ZV2) reactionLayout.m;
                if (zv2.c.size() < zv2.f) {
                    final ZV2 zv22 = (ZV2) reactionLayout.m;
                    zv22.n++;
                    final ReactionMetadata reactionMetadata = reactionLayout.k.f0;
                    zv22.b.a(new Callback() { // from class: TV2
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:19:0x00f9  */
                        /* JADX WARN: Removed duplicated region for block: B:23:0x0114  */
                        @Override // org.chromium.base.Callback
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void onResult(java.lang.Object r29) {
                            /*
                                Method dump skipped, instructions count: 313
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.TV2.onResult(java.lang.Object):void");
                        }
                    }, reactionMetadata.d);
                    return;
                }
                ((ZV2) reactionLayout.m).f();
            }
        });
        ChromeImageButton chromeImageButton3 = (ChromeImageButton) findViewById(R.id.delete_button);
        this.j = chromeImageButton3;
        chromeImageButton3.setOnClickListener(new View.OnClickListener() { // from class: tH2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReactionLayout reactionLayout = ReactionLayout.this;
                view.announceForAccessibility(reactionLayout.g.getString(R.string.f76340_resource_name_obfuscated_res_0x7f1405c1));
                ZV2 zv2 = (ZV2) reactionLayout.m;
                zv2.o++;
                zv2.c(reactionLayout, false);
                zv2.h.removeView(reactionLayout);
                zv2.d(reactionLayout);
                zv2.c.remove(reactionLayout);
            }
        });
    }

    public final void b(boolean z) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        int i = z ? 0 : 8;
        this.i.setVisibility(i);
        this.j.setVisibility(i);
        this.h.setVisibility(i);
        if (!this.n) {
            this.l.setBackground(null);
            return;
        }
        this.l.setBackgroundResource(R.drawable.f44900_resource_name_obfuscated_res_0x7f0900b9);
        ImageView imageView = this.l;
        int i2 = this.a;
        imageView.setPadding(i2, i2, i2, i2);
    }
}
