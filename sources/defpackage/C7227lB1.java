package defpackage;

import J.N;
import android.app.Activity;
import android.graphics.Bitmap;
import androidx.fragment.app.h;
import com.android.chrome.R;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.content_creation.reactions.LightweightReactionsDialog;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.components.content_creation.reactions.ReactionMetadata;
import org.chromium.components.content_creation.reactions.ReactionServiceBridge;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7227lB1 extends AbstractC5420fw implements ZO3 {
    public final h l;
    public final C10316uB1 m;
    public final LightweightReactionsDialog n;
    public final ZV2 o;
    public final WindowAndroid p;
    public List q;
    public Bitmap[] r;
    public boolean s;
    public boolean t;
    public long u;
    public long v;
    public long w;
    public ZN3 x;

    public C7227lB1(Activity activity, WindowAndroid windowAndroid, String str, QO qo, QB qb, ReactionServiceBridge reactionServiceBridge) {
        super(activity, str, qo, qb);
        this.p = windowAndroid;
        this.s = false;
        this.t = false;
        this.l = ((VS0) activity).h0();
        C10316uB1 c10316uB1 = new C10316uB1(AbstractC0687Fh1.b(1, ProfileKey.a()));
        this.m = c10316uB1;
        this.n = new LightweightReactionsDialog();
        this.o = new ZV2(activity, c10316uB1);
        Callback callback = new Callback() { // from class: gB1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [iB1] */
            /* JADX WARN: Type inference failed for: r9v0, types: [pB1] */
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                List list = (List) obj;
                final C7227lB1 c7227lB1 = C7227lB1.this;
                c7227lB1.q = list;
                c7227lB1.v = System.currentTimeMillis();
                final ?? r3 = new Callback() { // from class: iB1
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj2) {
                        return new ZE(this, obj2);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj2) {
                        Bitmap[] bitmapArr = (Bitmap[]) obj2;
                        C7227lB1 c7227lB12 = C7227lB1.this;
                        c7227lB12.getClass();
                        boolean z = bitmapArr != null;
                        long currentTimeMillis = System.currentTimeMillis() - c7227lB12.v;
                        int i = AbstractC10659vB1.b;
                        EI2.b("LightweightReactions.AssetsFetchSuccess", z);
                        EI2.k(currentTimeMillis, "LightweightReactions.AssetsFetchDuration.".concat(z ? "Success" : "Failure"));
                        if (z) {
                            c7227lB12.t = true;
                            c7227lB12.r = bitmapArr;
                            c7227lB12.g();
                            return;
                        }
                        Activity activity2 = c7227lB12.a;
                        String string = activity2.getString(R.string.f76270_resource_name_obfuscated_res_0x7f1405ba);
                        ZN3 zn3 = c7227lB12.x;
                        if (zn3 != null) {
                            zn3.a();
                        }
                        ZN3 c = ZN3.c(activity2, string, 0);
                        c7227lB12.x = c;
                        c.d();
                    }
                };
                final C10316uB1 c10316uB12 = c7227lB1.m;
                c10316uB12.getClass();
                if (list == null || list.isEmpty()) {
                    r3.onResult(null);
                    return;
                }
                int i = 0;
                c10316uB12.b = false;
                C7928nE c7928nE = UN.a;
                boolean M6bsIDpc = N.M6bsIDpc("LightweightReactions", "should_load_reactions_on_demand", false);
                int size = list.size();
                if (!M6bsIDpc) {
                    size *= 2;
                }
                final C9973tB1 c9973tB1 = new C9973tB1(size);
                final Bitmap[] bitmapArr = new Bitmap[list.size()];
                while (i < list.size()) {
                    ReactionMetadata reactionMetadata = (ReactionMetadata) list.get(i);
                    String str2 = reactionMetadata.c;
                    List list2 = list;
                    final int i2 = i;
                    final ?? r9 = new Callback() { // from class: pB1
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            Bitmap bitmap = (Bitmap) obj2;
                            C10316uB1 c10316uB13 = C10316uB1.this;
                            if (c10316uB13.b) {
                                return;
                            }
                            Callback callback2 = r3;
                            if (bitmap == null) {
                                c10316uB13.b = true;
                                callback2.onResult(null);
                                return;
                            }
                            int i3 = i2;
                            Bitmap[] bitmapArr2 = bitmapArr;
                            bitmapArr2[i3] = bitmap;
                            C9973tB1 c9973tB12 = c9973tB1;
                            int i4 = c9973tB12.a - 1;
                            c9973tB12.a = i4;
                            if (i4 == 0) {
                                callback2.onResult(bitmapArr2);
                            }
                        }
                    };
                    c10316uB12.a.d(C0037Ah1.b(str2, "LightweightReactions"), new Callback() { // from class: mB1
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            r9.onResult((Bitmap) obj2);
                        }
                    });
                    if (!M6bsIDpc) {
                        c10316uB12.a(new Callback() { // from class: qB1
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj2) {
                                return new ZE(this, obj2);
                            }

                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj2) {
                                C5070ev c5070ev = (C5070ev) obj2;
                                C10316uB1 c10316uB13 = C10316uB1.this;
                                if (c10316uB13.b) {
                                    return;
                                }
                                Callback callback2 = r3;
                                if (c5070ev == null) {
                                    c10316uB13.b = true;
                                    callback2.onResult(null);
                                    return;
                                }
                                C9973tB1 c9973tB12 = c9973tB1;
                                int i3 = c9973tB12.a - 1;
                                c9973tB12.a = i3;
                                if (i3 == 0) {
                                    callback2.onResult(bitmapArr);
                                }
                            }
                        }, reactionMetadata.d);
                    }
                    i++;
                    list = list2;
                }
            }
        };
        long j = reactionServiceBridge.a;
        if (j == 0) {
            return;
        }
        N.M6vgbmds(j, reactionServiceBridge, callback);
    }

    public final void g() {
        if (this.s && this.t) {
            Bitmap bitmap = this.k;
            C5853hB1 c5853hB1 = new C5853hB1(this);
            LightweightReactionsDialog lightweightReactionsDialog = this.n;
            lightweightReactionsDialog.s0 = bitmap;
            lightweightReactionsDialog.t0 = this.o;
            lightweightReactionsDialog.u0 = c5853hB1;
            this.u = System.currentTimeMillis();
            int i = AbstractC10659vB1.b;
            EI2.h(0, 4, "LightweightReactions.Funnel");
            lightweightReactionsDialog.Q0(this.l, null);
        }
    }

    public final long f() {
        return System.currentTimeMillis() - this.u;
    }

    @Override // defpackage.AbstractC5420fw
    public final void e() {
        if (this.k == null) {
            Activity activity = this.a;
            String string = activity.getString(R.string.f76290_resource_name_obfuscated_res_0x7f1405bc);
            ZN3 zn3 = this.x;
            if (zn3 != null) {
                zn3.a();
            }
            ZN3 c = ZN3.c(activity, string, 0);
            this.x = c;
            c.d();
            return;
        }
        this.s = true;
        g();
    }
}
