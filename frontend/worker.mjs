const BACKEND_URL = "http://ecom-backend.ap-south-1.elasticbeanstalk.com";

export default {
    async fetch(request, env) {
        const url = new URL(request.url);

        if (url.pathname.startsWith("/api/")) {
            const backendUrl = new URL(
                url.pathname + url.search,
                BACKEND_URL
            );

            const backendRequest = new Request(backendUrl, {
                method: request.method,
                headers: request.headers,
                body:
                    request.method === "GET" || request.method === "HEAD"
                        ? undefined
                        : request.body
            });

            return fetch(backendRequest);
        }

        return env.ASSETS.fetch(request);
    }
};