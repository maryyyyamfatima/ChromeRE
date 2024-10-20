package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.C10687vH;
import defpackage.C11058wM2;
import defpackage.C4856eI1;
import defpackage.C6963kR1;
import defpackage.C8658pM2;
import defpackage.C9001qM2;
import defpackage.E43;
import defpackage.I43;
import defpackage.KM2;
import defpackage.QH;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final C4856eI1 a = new C4856eI1("MediaIntentReceiver");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        I43 i43;
        E43 c;
        char c2;
        KM2 a2;
        KM2 a3;
        KM2 a4;
        KeyEvent keyEvent;
        KM2 a5;
        String action = intent.getAction();
        a.a("onReceive action: %s", action);
        if (action == null || (c = (i43 = C10687vH.c(context).c).c()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1699820260:
                if (action.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -945151566:
                if (action.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -945080078:
                if (action.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -668151673:
                if (action.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -124479363:
                if (action.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 235550565:
                if (action.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1362116196:
                if (action.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1997055314:
                if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                long longExtra = intent.getLongExtra("googlecast-extra_skip_step_ms", 0L);
                if (c instanceof QH) {
                    b((QH) c, -longExtra);
                    return;
                }
                return;
            case 1:
                if (!(c instanceof QH) || (a2 = a((QH) c)) == null) {
                    return;
                }
                MediaStatus e = a2.e();
                if (e != null && e.w) {
                    return;
                }
                if (!a2.h()) {
                    KM2.f();
                    return;
                } else {
                    KM2.b(new C9001qM2(a2));
                    return;
                }
            case 2:
                if (!(c instanceof QH) || (a3 = a((QH) c)) == null) {
                    return;
                }
                MediaStatus e2 = a3.e();
                if (e2 != null && e2.w) {
                    return;
                }
                if (!a3.h()) {
                    KM2.f();
                    return;
                } else {
                    KM2.b(new C8658pM2(a3));
                    return;
                }
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                i43.b(true);
                return;
            case 4:
                i43.b(false);
                return;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                if (!(c instanceof QH) || (a4 = a((QH) c)) == null) {
                    return;
                }
                a4.q();
                return;
            case 6:
                long longExtra2 = intent.getLongExtra("googlecast-extra_skip_step_ms", 0L);
                if (c instanceof QH) {
                    b((QH) c, longExtra2);
                    return;
                }
                return;
            case 7:
                if ((c instanceof QH) && intent.hasExtra("android.intent.extra.KEY_EVENT") && (keyEvent = (KeyEvent) intent.getExtras().get("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85 && (a5 = a((QH) c)) != null) {
                    a5.q();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static void b(QH qh, long j) {
        KM2 a2;
        if (j == 0 || (a2 = a(qh)) == null) {
            return;
        }
        MediaInfo d = a2.d();
        if (d != null && d.g == 2) {
            return;
        }
        MediaStatus e = a2.e();
        if (e != null && e.w) {
            return;
        }
        C6963kR1 c6963kR1 = new C6963kR1(a2.c() + j, 0, null);
        if (!a2.h()) {
            KM2.f();
        } else {
            KM2.b(new C11058wM2(a2, c6963kR1));
        }
    }

    public static KM2 a(QH qh) {
        if (qh.b()) {
            return qh.h;
        }
        return null;
    }
}
