package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class TI {
    public final InterfaceC7205l72 a;
    public Resources b;

    public TI(InterfaceC7205l72 interfaceC7205l72, Resources resources) {
        this.a = interfaceC7205l72;
        this.b = resources;
    }

    public final void b() {
        HashSet hashSet = new HashSet();
        Iterator it = AbstractC10374uN.b.iterator();
        while (it.hasNext()) {
            hashSet.add(((PI) AbstractC10374uN.a.get((String) it.next())).d);
        }
        a(hashSet, AbstractC10374uN.b);
    }

    public final void c(Resources resources) {
        List emptyList;
        String id;
        String id2;
        this.b = resources;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        C7549m72 c7549m72 = (C7549m72) this.a;
        int i = Build.VERSION.SDK_INT;
        C6861k72 c6861k72 = c7549m72.a;
        if (i < 26) {
            c6861k72.getClass();
            emptyList = Collections.emptyList();
        } else {
            emptyList = c6861k72.b.getNotificationChannelGroups();
        }
        Iterator it = emptyList.iterator();
        while (it.hasNext()) {
            id2 = ((NotificationChannelGroup) it.next()).getId();
            hashSet.add(id2);
        }
        Iterator it2 = c7549m72.e().iterator();
        while (it2.hasNext()) {
            id = ((NotificationChannel) it2.next()).getId();
            hashSet2.add(id);
        }
        hashSet.retainAll(AbstractC10031tN.a.keySet());
        hashSet2.retainAll(AbstractC10374uN.a.keySet());
        a(hashSet, hashSet2);
    }

    public final void a(Collection collection, Collection collection2) {
        PI pi;
        String id;
        String id2;
        String id3;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            QI qi = (QI) AbstractC10031tN.a.get((String) it.next());
            if (qi != null) {
                NotificationChannelGroup a = qi.a(this.b);
                id3 = a.getId();
                hashMap.put(id3, a);
            }
        }
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (C5660ge3.e(str) || TextUtils.equals(str, "default_channel_id")) {
                pi = null;
            } else {
                PI pi2 = (PI) AbstractC10374uN.a.get(str);
                if (pi2 == null) {
                    throw new IllegalStateException("Could not initialize channel: ".concat(str));
                }
                pi = pi2;
            }
            if (pi != null) {
                NotificationChannelGroup a2 = ((QI) AbstractC10031tN.a.get(pi.d)).a(this.b);
                NotificationChannel b = pi.b(this.b);
                id = a2.getId();
                hashMap.put(id, a2);
                id2 = b.getId();
                hashMap2.put(id2, b);
            }
        }
        Collection values = hashMap.values();
        InterfaceC7205l72 interfaceC7205l72 = this.a;
        Objects.requireNonNull(interfaceC7205l72);
        Iterator it3 = values.iterator();
        while (it3.hasNext()) {
            ((C7549m72) interfaceC7205l72).c((NotificationChannelGroup) it3.next());
        }
        Iterator it4 = hashMap2.values().iterator();
        while (it4.hasNext()) {
            ((C7549m72) interfaceC7205l72).b((NotificationChannel) it4.next());
        }
    }
}
