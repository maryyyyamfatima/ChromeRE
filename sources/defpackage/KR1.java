package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.CastOptions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KR1 {
    public final Context a;
    public final CastOptions b;
    public final HandlerC10413uU3 c;
    public final FR1 d;

    static {
        new C4856eI1("MediaSessionManager");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [FR1] */
    public KR1(Context context, CastOptions castOptions, BinderC6619jR1 binderC6619jR1) {
        this.a = context;
        this.b = castOptions;
        C10687vH c10687vH = C10687vH.j;
        if (c10687vH != null) {
            I43 i43 = c10687vH.c;
        }
        new IR1(this);
        if (!TextUtils.isEmpty(null)) {
            new ComponentName(context, (String) null);
        }
        if (!TextUtils.isEmpty(null)) {
            new ComponentName(context, (String) null);
        }
        new C2779Vk(context);
        new GR1(this);
        new C2779Vk(context);
        new HR1(this);
        this.c = new HandlerC10413uU3(Looper.getMainLooper());
        this.d = new Runnable() { // from class: FR1
            @Override // java.lang.Runnable
            public final void run() {
                KR1.this.a(false);
            }
        };
    }

    public final void a(boolean z) {
        if (this.b.k) {
            HandlerC10413uU3 handlerC10413uU3 = this.c;
            FR1 fr1 = this.d;
            if (fr1 != null) {
                handlerC10413uU3.removeCallbacks(fr1);
            }
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) CI2.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    handlerC10413uU3.postDelayed(fr1, 1000L);
                }
            }
        }
    }
}
