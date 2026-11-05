package elena.fierros.appatlas.vistas

import androidx.compose.runtime.Composable

@Composable
fun AppNavigation(
    viewModel: PaisesViewModel,
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "paises",
        modifier = modifier
    ) {
        composable("paises") {
            PaisesScreen(
                paises = viewModel.paises.value,
                cargando = viewModel.cargando.value,
                error = viewModel.error.value,
                onReintentar = { viewModel.cargarPaises() },
                onPaisClick = { },
                onJugar = { }
            )
        }
    }
}