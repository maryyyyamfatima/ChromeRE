package defpackage;

import J.N;
import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.chrome.R;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.content_creation.reactions.LightweightReactionsProgressDialog;
import org.chromium.chrome.browser.content_creation.reactions.scene.ReactionLayout;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gP3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5581gP3 {
    public final ZO3 a;
    public final UQ3 b;
    public final RelativeLayout c;

    public C5581gP3(View view, C7227lB1 c7227lB1, ZV2 zv2) {
        this.a = c7227lB1;
        this.b = zv2;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.lightweight_reactions_toolbar);
        this.c = relativeLayout;
        relativeLayout.findViewById(R.id.close_button).setOnClickListener(new View.OnClickListener() { // from class: bP3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C7227lB1 c7227lB12 = (C7227lB1) C5581gP3.this.a;
                EI2.g("LightweightReactions.TimeTo.DismissDialog", c7227lB12.f(), 10L, AbstractC10659vB1.a, 40);
                EI2.b("LightweightReactions.EditingDone", false);
                ZV2 zv22 = c7227lB12.o;
                AbstractC10659vB1.a(false, zv22.k, zv22.l, zv22.m, zv22.n, zv22.o, zv22.p);
                c7227lB12.n.L0(false, false);
            }
        });
        relativeLayout.findViewById(R.id.done_button).setOnClickListener(new View.OnClickListener() { // from class: cP3
            /* JADX WARN: Type inference failed for: r5v7, types: [fB1] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                final C7227lB1 c7227lB12 = (C7227lB1) C5581gP3.this.a;
                EI2.g("LightweightReactions.TimeTo.FinishEditing", c7227lB12.f(), 10L, AbstractC10659vB1.a, 40);
                EI2.h(1, 4, "LightweightReactions.Funnel");
                EI2.b("LightweightReactions.EditingDone", true);
                final ZV2 zv22 = c7227lB12.o;
                AbstractC10659vB1.a(true, zv22.k, zv22.l, zv22.m, zv22.n, zv22.o, zv22.p);
                Iterator it = zv22.c.iterator();
                while (it.hasNext()) {
                    EI2.h(((ReactionLayout) it.next()).k.f0.a, 10, "LightweightReactions.ReactionsUsed");
                }
                final C6539jB1 c6539jB1 = new C6539jB1(c7227lB12);
                zv22.c(zv22.g, false);
                c7227lB12.w = System.currentTimeMillis();
                final LightweightReactionsProgressDialog lightweightReactionsProgressDialog = new LightweightReactionsProgressDialog();
                lightweightReactionsProgressDialog.Q0(c7227lB12.l, null);
                String string = c7227lB12.a.getString(R.string.f76300_resource_name_obfuscated_res_0x7f1405bd, String.valueOf(System.currentTimeMillis()));
                ?? r5 = new Callback() { // from class: fB1
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        Locale locale;
                        LocaleList locales;
                        Uri uri = (Uri) obj;
                        C7227lB1 c7227lB13 = C7227lB1.this;
                        long f = c7227lB13.f();
                        boolean z = uri != null;
                        long currentTimeMillis = System.currentTimeMillis() - c7227lB13.w;
                        EI2.g("LightweightReactions.TimeTo.GenerateGif", f, 10L, AbstractC10659vB1.a, 40);
                        EI2.h(2, 4, "LightweightReactions.Funnel");
                        EI2.b("LightweightReactions.GifGenerationCancelled", false);
                        EI2.b("LightweightReactions.GifGenerationSuccess", z);
                        EI2.k(currentTimeMillis, "LightweightReactions.GifGenerationDuration");
                        Date date = new Date(System.currentTimeMillis());
                        int i = Build.VERSION.SDK_INT;
                        Activity activity = c7227lB13.a;
                        if (i >= 24) {
                            locales = activity.getResources().getConfiguration().getLocales();
                            locale = locales.get(0);
                        } else {
                            locale = activity.getResources().getConfiguration().locale;
                        }
                        String string2 = activity.getString(R.string.f76380_resource_name_obfuscated_res_0x7f1405c5, DateFormat.getDateInstance(3, locale).format(date));
                        WindowAndroid windowAndroid = c7227lB13.p;
                        ArrayList arrayList = new ArrayList(Collections.singletonList(uri));
                        C6883kB1 c6883kB1 = new C6883kB1(c7227lB13);
                        String str = "";
                        if (!TextUtils.isEmpty("") && !TextUtils.isEmpty("")) {
                            str = ((GURL) N.M1WDPiaY("")).i();
                        }
                        C6862k73 c6862k73 = new C6862k73(windowAndroid, string2, null, null, str, "image/gif", arrayList, null, null, null, c6883kB1, null, null, null);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        EP ep = new EP(false, false, false, null, new GURL(c7227lB13.g), false, false, true, null, 6);
                        lightweightReactionsProgressDialog.L0(false, false);
                        c7227lB13.n.L0(false, false);
                        ((O73) c7227lB13.h).m(c6862k73, ep, currentTimeMillis2);
                    }
                };
                final C10316uB1 c10316uB1 = c7227lB12.m;
                c10316uB1.c = false;
                final long currentTimeMillis = System.currentTimeMillis();
                lightweightReactionsProgressDialog.t0 = new View.OnClickListener() { // from class: nB1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C10316uB1.this.c = true;
                        zv22.a();
                        int a = (int) ((r7.d * 100.0d) / r1.a());
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        int i = AbstractC10659vB1.b;
                        EI2.b("LightweightReactions.GifGenerationCancelled", true);
                        EI2.k(currentTimeMillis2, "LightweightReactions.GifGenerationCancelled.Duration");
                        EI2.d(a, "LightweightReactions.GifGenerationCancelled.Progress");
                    }
                };
                AbstractC5832h73.h(string, new Y63(r5), new InterfaceC5144f73() { // from class: oB1
                    @Override // defpackage.InterfaceC5144f73
                    public final void a(FileOutputStream fileOutputStream, C3770b73 c3770b73) {
                        boolean z;
                        LightweightReactionsProgressDialog lightweightReactionsProgressDialog2 = lightweightReactionsProgressDialog;
                        C6539jB1 c6539jB12 = c6539jB1;
                        C10316uB1 c10316uB12 = C10316uB1.this;
                        c10316uB12.getClass();
                        C11817yb c11817yb = new C11817yb();
                        c11817yb.e = Math.round(4.1666665f);
                        c11817yb.p = 15;
                        c11817yb.d = 0;
                        c11817yb.g = fileOutputStream;
                        for (int i = 0; i < 6; i++) {
                            try {
                                c11817yb.g.write((byte) "GIF89a".charAt(i));
                            } catch (IOException unused) {
                                z = false;
                            }
                        }
                        z = true;
                        c11817yb.f = z;
                        ZV2 zv23 = zv22;
                        int a = zv23.a();
                        c10316uB12.d = 0;
                        Size b = zv23.b();
                        int width = b.getWidth();
                        int height = b.getHeight();
                        int max = Math.max(width, height);
                        float f = max <= 900 ? 1.0f : 900.0f / max;
                        int i2 = (int) (width * f);
                        int width2 = (int) (zv23.h.getWidth() * f);
                        c6539jB12.a(new C9630sB1(c10316uB12, lightweightReactionsProgressDialog2, zv23, c11817yb, fileOutputStream, width2, (int) (zv23.h.getHeight() * f), f, c6539jB12, (width2 - i2) / 2, i2, (int) (height * f), a, c3770b73));
                    }
                }, ".gif");
            }
        });
    }
}
