<div class="bg  " id="sidebar-dashboard">
    <a href="home" class="logo my-3   d-flex align-items-center">
        <img src="/img/logo.png" alt="">
        <span>
            <spam style="color: #5944f6;">Gestion</spam>du stock
        </span>
    </a>
    <h1>Hello from navigation</h1>
    <hr class="mb-3 ">
    <div class="list-group  d-flex ">

        <a href="<?=BASE_URL?>home" id="home" class="list-group-item mx-2 p-2 border-0 my-2  rounded-3  fw-bold  fs-6  " style="background:purple ;">
            <img src="/img/home.png">
            Accueil
        </a>
        <a href="produit" class="list-group-item mx-2 fw-bold border-0 bg-transparent p-2">
            <img src="/img/product.png" style="width: 30px;height: 30px;">
            Produit
        </a>
        <a href="fournisseurs" class="list-group-item mx-2 p-2 fw-bold  fs-6  border-0 bg-transparent my-2   ">
            <img src="/img/supplier.png"style="width: 30px;height: 30px;">
            Fournisseurs
        </a>
        <a href="Achat" class="list-group-item mx-2 p-2 fw-bold  fs-6  border-0 bg-transparent my-2   ">
            <img src="/img/achat.jpg"style="width: 30px;height: 30px;">
            Achat
        </a>
        <a href="Clients" class="list-group-item mx-2 border-0 fw-bold  fs-6  bg-transparent my-2 p-2 ">
            <img src="/img/client.png"style="width: 30px;height: 30px;">
            Client
        </a>
        <a href="vente" class="list-group-item mx-2 p-2 fw-bold  fs-6  border-0 bg-transparent my-2   ">
            <img src="/img/sales.png"style="width: 30px;height: 30px;">
            Vente
        </a>
        <a href="rapports" class="list-group-item mx-2 fw-bold  fs-6   border-0 my-2  rounded-3 p-2 ">
            <img src="/img/rapport.jpg"style="width: 30px;height: 30px;">
            Rapport
        </a>
        <a href="Configuration" class="list-group-item mx-2 fw-bold  fs-6  border-0 my-2  rounded-3 p-2  ">
            <img src="/img/config.png"style="width: 30px;height: 30px;">
            Configuration
        </a>
        <?php if($_SESSION['role']=='admin'):?>
        <a href="utilisateur" class="list-group-item mx-2 border-0 fw-bold  fs-6   bg-transparent my-2 p-2 ">
            <img src="/img/utilisateur.png"style="width: 30px;height: 30px;">
            Utilisateurs
        </a>
        <?php endif;?>
        <a href="logout" class="list-group-item mx-5 border-0 fw-bold  fs-6  bg-transparent  mt-5 mb-2 ">
            Logout <i class="fas fa-sign-out-alt"></i>
        </a>


    </div>
</div>