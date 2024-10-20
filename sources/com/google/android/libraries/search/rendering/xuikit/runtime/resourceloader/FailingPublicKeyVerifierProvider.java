package com.google.android.libraries.search.rendering.xuikit.runtime.resourceloader;

import com.google.android.libraries.elements.interfaces.PublicKeyVerifier;
import com.google.android.libraries.elements.interfaces.PublicKeyVerifierProvider;
import defpackage.AbstractC0087Ar1;
import io.grpc.Status;
import kotlin.Metadata;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/google/android/libraries/search/rendering/xuikit/runtime/resourceloader/FailingPublicKeyVerifierProvider;", "Lcom/google/android/libraries/elements/interfaces/PublicKeyVerifierProvider;", "()V", "createVerifier", "Lcom/google/android/libraries/elements/interfaces/PublicKeyVerifier;", "java.com.google.android.libraries.search.rendering.xuikit.runtime.resourceloader_resourceloader"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FailingPublicKeyVerifierProvider extends PublicKeyVerifierProvider {
    @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifierProvider
    public PublicKeyVerifier createVerifier() {
        return new PublicKeyVerifier() { // from class: com.google.android.libraries.search.rendering.xuikit.runtime.resourceloader.FailingPublicKeyVerifierProvider$createVerifier$1
            @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifier
            public Status initialize(String rootCertIdentifier, byte[] rootCertBytes, byte[] intermediateCertBytes) {
                AbstractC0087Ar1.e(rootCertIdentifier, "rootCertIdentifier");
                AbstractC0087Ar1.e(rootCertBytes, "rootCertBytes");
                AbstractC0087Ar1.e(intermediateCertBytes, "intermediateCertBytes");
                return Status.e;
            }

            @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifier
            public Status verify(byte[] signature, byte[] body) {
                AbstractC0087Ar1.e(signature, "signature");
                AbstractC0087Ar1.e(body, "body");
                return Status.e;
            }
        };
    }
}
