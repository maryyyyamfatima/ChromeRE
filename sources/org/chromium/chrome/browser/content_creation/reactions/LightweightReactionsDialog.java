package org.chromium.chrome.browser.content_creation.reactions;

import android.app.Dialog;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.android.chrome.R;
import defpackage.AbstractC10659vB1;
import defpackage.C5490g8;
import defpackage.C5581gP3;
import defpackage.C5853hB1;
import defpackage.C7227lB1;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import defpackage.EI2;
import defpackage.Ge4;
import defpackage.UV2;
import defpackage.YV2;
import defpackage.ZV2;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.content_creation.reactions.scene.ReactionLayout;
import org.chromium.components.content_creation.reactions.ReactionMetadata;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LightweightReactionsDialog extends DialogInterfaceOnCancelListenerC7423lm0 {
    public View r0;
    public Bitmap s0;
    public ZV2 t0;
    public C5853hB1 u0;
    public int v0;

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        C5490g8 c5490g8 = new C5490g8(getActivity(), R.style.f105230_resource_name_obfuscated_res_0x7f150548);
        if (this.t0 != null) {
            this.v0 = N().getConfiguration().orientation;
            View inflate = getActivity().getLayoutInflater().inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0249, (ViewGroup) null);
            this.r0 = inflate;
            ((ImageView) inflate.findViewById(R.id.lightweight_reactions_background)).setImageDrawable(new BitmapDrawable(N(), this.s0));
            final ZV2 zv2 = this.t0;
            RelativeLayout relativeLayout = (RelativeLayout) this.r0.findViewById(R.id.lightweight_reactions_scene);
            ImageView imageView = (ImageView) this.r0.findViewById(R.id.lightweight_reactions_background);
            zv2.h = relativeLayout;
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: SV2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZV2 zv22 = ZV2.this;
                    zv22.c(zv22.g, false);
                }
            });
            zv2.i = imageView;
            View view = this.r0;
            c5490g8.a.q = view;
            C5853hB1 c5853hB1 = this.u0;
            if (c5853hB1 != null) {
                C7227lB1 c7227lB1 = c5853hB1.a;
                ZV2 zv22 = c7227lB1.o;
                final C5581gP3 c5581gP3 = new C5581gP3(view, c7227lB1, zv22);
                List list = c7227lB1.q;
                Bitmap[] bitmapArr = c7227lB1.r;
                RelativeLayout relativeLayout2 = c5581gP3.c;
                LinearLayout linearLayout = (LinearLayout) relativeLayout2.findViewById(R.id.lightweight_reactions_toolbar_reaction_picker);
                for (int i = 0; i < bitmapArr.length; i++) {
                    ReactionMetadata reactionMetadata = (ReactionMetadata) list.get(i);
                    ImageView imageView2 = new ImageView(relativeLayout2.getContext());
                    imageView2.setImageBitmap(bitmapArr[i]);
                    imageView2.setLayoutParams(new LinearLayout.LayoutParams(Ge4.b(relativeLayout2.getContext(), 56.0f), -1));
                    imageView2.setAdjustViewBounds(true);
                    imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imageView2.setClickable(true);
                    imageView2.setTag(reactionMetadata);
                    imageView2.setOnClickListener(new View.OnClickListener() { // from class: dP3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C5581gP3 c5581gP32 = C5581gP3.this;
                            c5581gP32.getClass();
                            final ReactionMetadata reactionMetadata2 = (ReactionMetadata) ((ImageView) view2).getTag();
                            final ZV2 zv23 = (ZV2) c5581gP32.b;
                            ReactionLayout reactionLayout = zv23.g;
                            C10316uB1 c10316uB1 = zv23.b;
                            if (reactionLayout == null) {
                                if (zv23.c.size() < zv23.f) {
                                    zv23.k++;
                                    c10316uB1.a(new UV2(zv23, reactionMetadata2), reactionMetadata2.d);
                                    return;
                                } else {
                                    zv23.f();
                                    return;
                                }
                            }
                            zv23.l++;
                            c10316uB1.a(new Callback() { // from class: RV2
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj) {
                                    return new ZE(this, obj);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj) {
                                    ZV2 zv24 = ZV2.this;
                                    ReactionLayout reactionLayout2 = zv24.g;
                                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                    ReactionMetadata reactionMetadata3 = reactionMetadata2;
                                    C9661sH2 c9661sH2 = new C9661sH2(reactionMetadata3, (C5070ev) obj, config);
                                    String str = reactionMetadata3.b;
                                    reactionLayout2.k = c9661sH2;
                                    reactionLayout2.l.setImageDrawable(c9661sH2);
                                    reactionLayout2.l.setContentDescription(str);
                                    zv24.e(zv24.g);
                                    zv24.g.announceForAccessibility(zv24.a.getString(R.string.0_resource_name_obfuscated_res_0x7f1405c0));
                                }
                            }, reactionMetadata2.d);
                        }
                    });
                    imageView2.setContentDescription(reactionMetadata.b);
                    linearLayout.addView(imageView2);
                }
                ReactionMetadata reactionMetadata2 = (ReactionMetadata) c7227lB1.q.get(0);
                zv22.k++;
                zv22.b.a(new UV2(zv22, reactionMetadata2), reactionMetadata2.d);
            }
            return c5490g8.a();
        }
        L0(false, false);
        return c5490g8.a();
    }

    @Override // androidx.fragment.app.c, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f11484J = true;
        int i = this.v0;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.v0 = i2;
            int i3 = AbstractC10659vB1.b;
            EI2.h(i2 != 1 ? 0 : 1, 2, "LightweightReactions.OrientationChange");
            ZV2 zv2 = this.t0;
            float x = zv2.i.getX();
            float width = zv2.i.getWidth();
            float width2 = zv2.b().getWidth();
            zv2.h.getViewTreeObserver().addOnGlobalLayoutListener(new YV2(zv2, width2, ((width - width2) / 2.0f) + x));
        }
    }
}
